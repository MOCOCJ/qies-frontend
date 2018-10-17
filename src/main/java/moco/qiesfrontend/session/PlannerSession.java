package moco.qiesfrontend.session;

import moco.qiesfrontend.transaction.CancelTicket;
import moco.qiesfrontend.transaction.ChangeTicket;
import moco.qiesfrontend.transaction.CreateService;
import moco.qiesfrontend.transaction.DeleteService;
import moco.qiesfrontend.transaction.SellTicket;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * PlannerSession
 */
public class PlannerSession extends ActiveSession implements Session {

    @Override
    public TransactionQueue process(SessionManager manager, TransactionQueue queue) {
        Input input = manager.getInput();
        boolean run = true;
        TransactionRecord record;
        String goodMessage = "Logged in as Agent. Enter command to begin a transaction.";
        String message = goodMessage;
        String command;

        while (run) {
            command = input.takeInput(message);

            switch (command) {
            case "sellticket":
                record = sellTicket();
                break;
            case "changeticket":
                record = changeTicket();
                break;
            case "cancelticket":
                record = cancelTicket();
                break;
            case "createservice":
                record = createService();
                break;
            case "deleteservice":
                record = deleteService();
                break;
            case "logout":
                record = logout();
                run = false;
                break;
            }
        }

        return queue;
    }

    public TransactionRecord sellTicket() {
        SellTicket sellTicket = new SellTicket();
        return sellTicket.makeTransaction();
    }

    public TransactionRecord changeTicket() {
        ChangeTicket changeTicket = new ChangeTicket();
        return changeTicket.makeTransaction();
    }

    public TransactionRecord cancelTicket() {
        CancelTicket cancelTicket = new CancelTicket();
        return cancelTicket.makeTransaction();
    }

    public TransactionRecord createService() {
        CreateService createService = new CreateService();
        return createService.makeTransaction();
    }

    public TransactionRecord deleteService() {
        DeleteService deleteService = new DeleteService();
        return deleteService.makeTransaction();
    }

}