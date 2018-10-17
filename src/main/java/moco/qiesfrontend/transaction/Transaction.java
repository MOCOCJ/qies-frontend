package moco.qiesfrontend.transaction;

import java.util.Optional;

import moco.qiesfrontend.session.Input;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * Transaction
 */
public abstract class Transaction {

    protected TransactionRecord record;

    public abstract Optional<TransactionRecord> makeTransaction(Input input);
}