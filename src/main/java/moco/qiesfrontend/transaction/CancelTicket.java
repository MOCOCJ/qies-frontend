package moco.qiesfrontend.transaction;

import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * CancelTicket
 */
public class CancelTicket extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.CAN;

    public CancelTicket() {
     
    }

    @Override
    public TransactionRecord makeTransaction() {
        return null;
    }
}