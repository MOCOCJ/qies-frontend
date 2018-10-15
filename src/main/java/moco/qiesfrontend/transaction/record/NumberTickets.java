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
public class NumberTickets extends RecordElement{
    // Vars
    private int number;
    private final static int DEFAULT = 0; // Current int is just a filler

    public NumberTickets(int numbers) {

    }

    public static boolean isValid(int value) {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }

}