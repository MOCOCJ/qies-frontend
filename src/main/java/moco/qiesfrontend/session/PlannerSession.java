package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * PlannerSession
 */
public class PlannerSession extends ActiveSession implements Session {

    public PlannerSession() {

    }

    public TransactionRecord createService() {

        return null;
    }

    public TransactionRecord deleteService() {

        return null;
    }

    public TransactionRecord changeTicket() {

        return null;
    }

    public TransactionRecord cancelTicket() {

        return null;
    }

    @Override
    public TransactionQueue process(SessionManager manager, TransactionQueue queue) {
        Input input = manager.getInput();
        boolean run = true;
        String message = "You are not logged in, please log in before performing any other actions. (login)";
        String userInput;
        
        while(run) {
            
        }

        return queue;
    }

}