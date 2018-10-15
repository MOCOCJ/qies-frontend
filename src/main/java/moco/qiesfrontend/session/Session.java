package moco.qiesfrontend.session;

/**
 * Session
 */
public interface Session {

    TransactionQueue process();

    default SessionManager getManager() {
        return null;
    }
}