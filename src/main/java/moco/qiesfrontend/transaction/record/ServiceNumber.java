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
        this.number = number;
        this.isSet = true;
    }

    public static boolean isValid(String value) {
        return true;
    }

    @Override
    public String toString() {
        if (isSet) {
            return number;
        }
        return DEFAULT;
    }
}