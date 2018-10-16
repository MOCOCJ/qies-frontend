package moco.qiesfrontend.transaction;

import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * Transaction
 */
public abstract class Transaction {

    protected TransactionRecord record;

    public abstract TransactionRecord makeTransaction();
}