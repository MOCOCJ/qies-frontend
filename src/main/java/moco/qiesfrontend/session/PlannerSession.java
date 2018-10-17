package moco.qiesfrontend.session;


import moco.qiesfrontend.transaction.CancelTicket;
import moco.qiesfrontend.transaction.ChangeTicket;
import moco.qiesfrontend.transaction.CreateService;
import moco.qiesfrontend.transaction.DeleteService;

import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * PlannerSession
 */
public class PlannerSession extends ActiveSession implements Session {
    
    @Override
    public void process(SessionManager manager, TransactionQueue queue) {
        Input input = manager.getInput();
        boolean run = true;
        TransactionRecord record = null;
        String goodMessage = "Logged in as Planner. Enter command to begin a transaction.";
        String message = goodMessage;
        String command;

        while (run) {
            command = input.takeInput(message);

            switch (command) {
            case "sellticket":
                record = sellTicket(input);
                break;
            case "changeticket":
                record = changeTicket(input);
                break;
            case "cancelticket":
                record = cancelTicket(input);
                break;
            case "createservice":
                record = createService(input);
                break;
            case "deleteservice":
                record = deleteService(input);
                break;
            case "logout":
                record = logout(input);
                run = false;
                break;
            }

            if (record != null)
                queue.push(record);
        }

        manager.setSession(new NoSession());
    }

    public TransactionRecord changeTicket(Input input) {
        ChangeTicket changeTicket = new ChangeTicket();
        return changeTicket.makeTransaction(input);
    }

    public TransactionRecord cancelTicket(Input input) {
        CancelTicket cancelTicket = new CancelTicket();
        return cancelTicket.makeTransaction(input);
    }

    public TransactionRecord createService(Input input) {
        CreateService createService = new CreateService();
        return createService.makeTransaction(input);
    }

    public TransactionRecord deleteService(Input input) {
        DeleteService deleteService = new DeleteService();
        return deleteService.makeTransaction(input);
    }

}