package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.TransactionQueue;

/**
 * NoSession
 */
public class NoSession implements Session {

    @Override
    public TransactionQueue process() {
		return null;
	}

    
}