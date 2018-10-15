package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.TransactionQueue;

/**
 * PlannerSession
 */
public class PlannerSession extends ActiveSession implements Session {

    @Override
    public TransactionQueue process() {
		return null;
	}

    
}