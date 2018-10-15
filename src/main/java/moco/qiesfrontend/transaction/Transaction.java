package moco.qiesfrontend.transaction;

import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * Transaction
 */
public interface Transaction {

    default TransactionRecord makeTransaction() {
        System.out.println("[WARNING] This transaction is not yet implemented.");
        return null;
    }
}