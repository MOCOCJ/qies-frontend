package moco.qiesfrontend.session;

/**
 * PlannerSession
 */
public class PlannerSession extends ActiveSession implements Session {

    @Override
    public TransactionQueue process(SessionManager manager, TransactionQueue queue) {
        return queue;
    }

    
}