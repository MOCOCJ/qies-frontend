package moco.qiesfrontend.transaction.record;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ServiceName
 */
@Getter
@Setter
@NoArgsConstructor
public class ServiceName extends RecordElement{
    // Vars
    private String name;
    private final static int DEFAULT = 0; // Current int is just a filler

    public ServiceName(String name) {

    }

    public static boolean isValid(String value) {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }

}