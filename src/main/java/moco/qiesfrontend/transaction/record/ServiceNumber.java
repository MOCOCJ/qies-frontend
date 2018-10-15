package moco.qiesfrontend.transaction.record;

import lombok.Getter;
import lombok.Setter;

/**
 * ServiceNumber
 */
@Getter
@Setter
public class ServiceNumber {
    // Vars
    private String number;
    private final static String DEFULT = "00000";

    public ServiceNumber(String number) {

    }
    
    public static boolean isValid(String value) {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }


}