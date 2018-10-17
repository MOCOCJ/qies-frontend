package moco.qiesfrontend.transaction;

import java.util.Optional;

import moco.qiesfrontend.session.Input;
import moco.qiesfrontend.transaction.record.TransactionCode;
import moco.qiesfrontend.transaction.record.TransactionRecord;

/**
 * CreateService
 */
public class CreateService extends Transaction {
    // Vars
    public static TransactionCode CODE = TransactionCode.CRE;

    public CreateService() {
        record = new TransactionRecord(CODE);
    }

    @Override
    public Optional<TransactionRecord> makeTransaction(Input input) {
        Optional<TransactionRecord> optionalRecord = Optional.of(record);
        return optionalRecord;
    }
}