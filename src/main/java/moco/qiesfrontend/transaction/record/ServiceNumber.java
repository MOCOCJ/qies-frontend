package moco.qiesfrontend.transaction.record;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ServiceNumber
 */
@Getter
@Setter
@NoArgsConstructor
public class ServiceNumber extends RecordElement {
    // Vars
    private String number;
    private final static String DEFAULT = "00000";

    public ServiceNumber(String number) {
        if (isValid(number)) {
            this.number = number;
            this.isSet = true;
        } else {
            // Throw exception
        }
    }

    public static boolean isValid(String value) {
        if (value.length() == 5) {
            if (value.charAt(0) != '0') {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if (isSet) {
            return number;
        }
        return DEFAULT;
    }
}