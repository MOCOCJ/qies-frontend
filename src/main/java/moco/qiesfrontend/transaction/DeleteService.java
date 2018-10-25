package moco.qiesfrontend.transaction;

import moco.qiesfrontend.session.Input;
import moco.qiesfrontend.session.SessionManager;
import moco.qiesfrontend.transaction.record.ServiceName;
import moco.qiesfrontend.transaction.record.ServiceNumber;
import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * DeleteService
 */
public class DeleteService extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.DEL;

    public DeleteService() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public TransactionRecord makeTransaction(Input input, SessionManager manager) {
        String serviceNumberIn;
        String serviceNameIn;
        ServiceNumber serviceNumber;
        ServiceName serviceName;

        serviceNumberIn = input.takeInput("Enter service number of the service you wish to delete.");
        try {
            serviceNumber = new ServiceNumber(serviceNumberIn);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid service number.");
            return null;
        }

        serviceNameIn = input.takeInput("Enter service name of the service you wish to delete.");
        try {
            serviceName = new ServiceName(serviceNameIn);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid service name.");
            return null;
        }

        record.setSourceNumber(serviceNumber);
        record.setServiceName(serviceName);

        return record;
    }

    @Override
    public TransactionRecord makeTransaction(Input input) {
        return null;
    }

    @Override
    public TransactionRecord makeTransaction(Input input, SessionManager manager, int ticketCount) {
        return null;
    }

}