package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.TransactionQueue;

/**
 * Session
 */
public interface Session {

    TransactionQueue process();
}