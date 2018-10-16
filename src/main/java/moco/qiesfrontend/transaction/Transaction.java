package moco.qiesfrontend.transaction;

import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * Transaction
 */
public abstract class Transaction {

    private TransactionRecord record;

    abstract TransactionRecord makeTransaction();
}