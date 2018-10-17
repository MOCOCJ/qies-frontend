package moco.qiesfrontend.transaction;

import moco.qiesfrontend.session.Input;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * Transaction
 */
public abstract class Transaction {

    protected TransactionRecord record;

    public abstract TransactionRecord makeTransaction(Input input);
}