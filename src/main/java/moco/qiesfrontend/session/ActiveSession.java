package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.TransactionQueue;

/**
 * ActiveSession
 */
public abstract class ActiveSession implements Session {

    private TransactionQueue records;

    
}