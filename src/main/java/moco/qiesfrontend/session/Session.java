package moco.qiesfrontend.session;

/**
 * Session
 */
public interface Session {

    TransactionQueue process();
}