package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.Logout;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * ActiveSession
 */
public abstract class ActiveSession implements Session {

    public TransactionRecord logout() {
        Logout logout = new Logout();
        return logout.makeTransaction();
    }
}