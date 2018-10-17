package moco.qiesfrontend.transaction;

import moco.qiesfrontend.session.Input;
import moco.qiesfrontend.transaction.record.NumberTickets;
import moco.qiesfrontend.transaction.record.ServiceNumber;
import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * ChangeTicket
 */
public class ChangeTicket extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.CHG;

    public ChangeTicket() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public TransactionRecord makeTransaction(Input input) {
        String sourceNumberIn;
        String destinationNumberIn;
        int numTicketsIn;
        ServiceNumber sourceNumber;
        ServiceNumber destinationNumber;
        NumberTickets numberTickets;

        sourceNumberIn = input.takeInput("Enter service number of the service you want to change.");
        try {
            sourceNumber = new ServiceNumber(sourceNumberIn);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid service number.");
            return null;
        }

        destinationNumberIn = input.takeInput("Enter service number of the service you want to change to.");
        try {
            destinationNumber = new ServiceNumber(destinationNumberIn);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid service number.");
            return null;
        }

        numTicketsIn = Integer.parseInt(input.takeInput("Enter number of tickets to change."));
        try {
            numberTickets = new NumberTickets(numTicketsIn);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid number of tickets.");
            return null;
        }

        record.setSourceNumber(sourceNumber);
        record.setDestinationNumber(destinationNumber);
        record.setNumberTickets(numberTickets);

        return record;
    }
}