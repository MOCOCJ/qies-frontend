package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.record.ServiceNumber;;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.File;

/**
 * ValidServicesList
 */
public class ValidServicesList {

    private HashSet<ServiceNumber> validService = new HashSet<ServiceNumber>();

    public ValidServicesList(File validServicesFile) {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(validServicesFile));

        while (line = reader.readLine() != null) {
            validService.add(new ServiceNumber(Integer.parseInt(line)));
        }
    }

    public boolean isInList(ServiceNumber service) {
        if (validService.contains(service)) {
            return true;
        }
        return false;
    }

}