package moco.qiesfrontend.transaction;

import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * CreateService
 */
public class CreateService extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.CRE;

    public CreateService() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public TransactionRecord makeTransaction() {
        return record;
    }
}