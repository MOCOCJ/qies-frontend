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
    public void process(SessionManager manager, TransactionQueue queue) {
        Input input = manager.getInput();
        boolean run = true;
        TransactionRecord record = null;
        String goodMessage = "Logged in as Agent. Enter command to begin a transaction.";
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

    public TransactionRecord sellTicket(Input input) {
        SellTicket sellTicket = new SellTicket();
        return sellTicket.makeTransaction(input);
    }

    public TransactionRecord changeTicket(Input input) {
        ChangeTicket changeTicket = new ChangeTicket();
        return changeTicket.makeTransaction(input);
    }

    public TransactionRecord cancelTicket(Input input) {
        CancelTicket cancelTicket = new CancelTicket();
        return cancelTicket.makeTransaction(input);
    }
}