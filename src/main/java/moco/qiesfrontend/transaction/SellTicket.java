package moco.qiesfrontend.transaction;

import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * SellTicket
 */
public class SellTicket extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.SEL;

    public SellTicket() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public TransactionRecord makeTransaction() {
        return record;
    }
}