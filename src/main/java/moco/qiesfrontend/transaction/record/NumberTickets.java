package moco.qiesfrontend.transaction.record;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * NumberTickets
 */
@Getter
@Setter
@NoArgsConstructor
public class NumberTickets extends RecordElement {
    // Vars
    private int number;
    private final static int DEFAULT = 0;

    public NumberTickets(int numbers) {
        if (isValid(numbers)) {
            number = numbers;
            isSet = true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isValid(int value) {
        if (value >= 1 && value <= 1000) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (isSet) {
            return Integer.toString(number);
        }
        return Integer.toString(DEFAULT);
    }

}