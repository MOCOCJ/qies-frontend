package moco.qiesfrontend.transaction;

import moco.qiesfrontend.session.Input;
import moco.qiesfrontend.transaction.record.NumberTickets;
import moco.qiesfrontend.transaction.record.ServiceNumber;
import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * SellTicket
 */
public class SellTicket extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.SEL;

    public SellTicket() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public TransactionRecord makeTransaction(Input input) {
        String serviceNumberIn;
        int numTicketsIn;
        ServiceNumber serviceNumber;
        NumberTickets numberTickets;

        serviceNumberIn = input.takeInput("Enter service number to sell tickets for.");
        try {
            serviceNumber = new ServiceNumber(serviceNumberIn);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid service number.");
            return null;
        }

        numTicketsIn = Integer.parseInt(input.takeInput("Enter number of tickets to sell."));
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