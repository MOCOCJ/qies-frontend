package moco.qiesfrontend.transaction;

import moco.qiesfrontend.session.Input;
import moco.qiesfrontend.transaction.record.NumberTickets;
import moco.qiesfrontend.transaction.record.ServiceNumber;
import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * CancelTicket
 */
public class CancelTicket extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.CAN;

    public CancelTicket() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public TransactionRecord makeTransaction(Input input) {
        String serviceNumberIn;
        int numTicketsIn;
        ServiceNumber serviceNumber;
        NumberTickets numberTickets;

        serviceNumberIn = input.takeInput("Enter service number of ticket you would like to cancel.");
        try {
            serviceNumber = new ServiceNumber(serviceNumberIn);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid service number.");
            return null;
        }

        numTicketsIn = Integer.parseInt(input.takeInput("Enter number of tickets you wan."));
        try {
            numberTickets = new NumberTickets(numTicketsIn);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid number of tickets.");
            return null;
        }

        record.setSourceNumber(serviceNumber);
        record.setNumberTickets(numberTickets);

        return record;
    }
}