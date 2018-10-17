package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.Logout;
import moco.qiesfrontend.transaction.SellTicket;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * ActiveSession
 */
public abstract class ActiveSession implements Session {

    public TransactionRecord logout(Input input) {
        Logout logout = new Logout();
        return logout.makeTransaction(input).get();
    }

    public TransactionRecord sellTicket(Input input) {
        SellTicket sellTicket = new SellTicket();
        return sellTicket.makeTransaction(input).get();
    }
}