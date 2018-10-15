package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.record.ServiceNumber;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * ValidServicesList
 */
public class ValidServicesList {

    private HashSet<ServiceNumber> validService = new HashSet<ServiceNumber>();

    public ValidServicesList(File validServicesFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(validServicesFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                validService.add(new ServiceNumber(line));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}

    }

    public boolean isInList(ServiceNumber service) {
        if (validService.contains(service)) {
            return true;
        }
        return false;
    }

}