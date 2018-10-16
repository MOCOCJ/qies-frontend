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

    }

    public static boolean isValid(String value) {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ServiceNumber))
            return false;

        ServiceNumber other = (ServiceNumber) o;
        return other.getNumber().equals(this.number) && (other.isSet() == this.isSet());
    }
}