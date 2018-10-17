package moco.qiesfrontend.transaction;

import moco.qiesfrontend.session.Input;
import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * DeleteService
 */
public class DeleteService extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.DEL;

    public DeleteService() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public TransactionRecord makeTransaction(Input input) {
        return record;
    }
}