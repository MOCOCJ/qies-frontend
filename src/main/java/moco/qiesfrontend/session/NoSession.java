package moco.qiesfrontend.session;

/**
 * NoSession
 */
public class NoSession implements Session {

    @Override
    public TransactionQueue process(SessionManager manager, TransactionQueue queue) {
        return queue;
    }

    public void logIn(SessionManager manager) {

    }
}