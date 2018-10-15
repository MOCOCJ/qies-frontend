package moco.qiesfrontend.transaction.record;

import lombok.Getter;
import lombok.Setter;

/**
 * ServiceDate
 */
@Getter
@Setter
public class ServiceDate {
    // Vars
    private String year;
    private String month;
    private String day;
    private final static String DEFULT = "00000"; // May not be correct DEFULT value (was copied from ServiceNumber)

    public ServiceDate() {

    }

    public static boolean isValid() {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }

    
}