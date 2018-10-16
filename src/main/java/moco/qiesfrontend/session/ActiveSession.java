package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.Logout;
import moco.qiesfrontend.transaction.SellTicket;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * ActiveSession
 */
public abstract class ActiveSession implements Session {

    public TransactionRecord logout() { //TODO: Full functionality
        Logout logout = new Logout();
        return logout.makeTransaction();
    }

    public TransactionRecord sellTicket() {
        SellTicket sellTicket = new SellTicket();
        return sellTicket.makeTransaction();
    }
}