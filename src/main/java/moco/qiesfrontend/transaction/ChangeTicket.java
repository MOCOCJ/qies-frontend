package moco.qiesfrontend.transaction;

import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * ChangeTicket
 */
public class ChangeTicket extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.CHG;

    public ChangeTicket() {
     
    }

    @Override
    TransactionRecord makeTransaction() {
        return null;
	}
    
}