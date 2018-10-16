package moco.qiesfrontend.transaction;

import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * Logout
 */
public class Logout extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.EOS;

    public Logout() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public TransactionRecord makeTransaction() {
        return record;
    }
}