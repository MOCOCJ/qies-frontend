package moco.qiesfrontend.transaction.record;

import lombok.Getter;
import lombok.Setter;

/**
 * NumberTickets
 */
@Getter
@Setter
public class NumberTickets {
    // Vars
    private int number;
    private final static int DEFAULT = 0; // Current int is just a filler

    public NumberTickets() {

    }

    static boolean isValid(int value) {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }

}