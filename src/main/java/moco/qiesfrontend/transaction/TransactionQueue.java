package moco.qiesfrontend.transaction;

import java.util.ArrayDeque;
import java.util.Queue;

import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * TransactionQueue
 */
public class TransactionQueue {

    private Queue<TransactionRecord> records;

    public TransactionQueue() {
        records = new ArrayDeque<>();
    }

    public void add(TransactionRecord element) {
        records.add(element);
    }
}