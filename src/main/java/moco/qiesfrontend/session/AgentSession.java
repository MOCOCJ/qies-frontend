package moco.qiesfrontend.session;

import java.util.Map;

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

    }

    public TransactionRecord cancelTicket() {
        return null;
    }

    @Override
    public TransactionQueue process(SessionManager manager, TransactionQueue queue) {
        return queue;
	}
}