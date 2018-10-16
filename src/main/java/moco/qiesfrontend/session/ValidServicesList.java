package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.record.ServiceNumber;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * ValidServicesList
 */
public class ValidServicesList {

    private Set<ServiceNumber> validServices;

    public ValidServicesList(File validServicesFile) {
        validServices = new HashSet<ServiceNumber>();

        try (BufferedReader br = new BufferedReader(new FileReader(validServicesFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                validServices.add(new ServiceNumber(line));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean isInList(ServiceNumber service) {
        if (validServices.contains(service)) {
            return true;
        }
        return false;
    }

}