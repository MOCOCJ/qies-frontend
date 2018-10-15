package moco.qiesfrontend.transaction.record;

import lombok.Getter;
import lombok.Setter;

/**
 * TransactionRecord
 */
@Getter
@Setter
public class TransactionRecord {

    private TransactionCode code;
    private ServiceNumber sourceNumber;
    private NumberTickets numberTickets;
    private ServiceNumber destinationNumber;
    private ServiceDate serviceDate;

    public TransactionRecord(TransactionCode code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(69);

        sb.append(code.toString());
        sb.append(' ');
        sb.append(sourceNumber.toString());
        sb.append(' ');
        sb.append(numberTickets.toString());

        return sb.toString();
    }
}