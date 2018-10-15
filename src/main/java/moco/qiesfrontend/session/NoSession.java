package moco.qiesfrontend.session;

/**
 * NoSession
 */
public class NoSession implements Session {

    @Override
    public TransactionQueue process() {
		return null;
	}

    
}