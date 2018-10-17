package moco.qiesfrontend.transaction;

import moco.qiesfrontend.session.Input;
import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * CancelTicket
 */
public class CancelTicket extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.CAN;

    public CancelTicket() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public TransactionRecord makeTransaction(Input input) {
        return record;
    }
}