package moco.qiesfrontend.session;

import java.util.HashMap;
import java.util.Map;

import moco.qiesfrontend.transaction.CancelTicket;
import moco.qiesfrontend.transaction.ChangeTicket;
import moco.qiesfrontend.transaction.SellTicket;
import moco.qiesfrontend.transaction.record.ServiceNumber;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * AgentSession
 */
public class AgentSession extends ActiveSession implements Session {

    private int changedTickets;
    private int totalCancelledTickets;
    private Map<ServiceNumber, Integer> cancelledTickets;

    public AgentSession() {
        cancelledTickets = new HashMap<ServiceNumber, Integer>();
    }

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

                    break;
                case "changeticket":

                    break;
                case "cancelticket":

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
}