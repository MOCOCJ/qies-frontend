package moco.qiesfrontend.session;

import java.io.File;

import lombok.Getter;
import lombok.Setter;

/**
 * SessionManager
 */
@Getter
@Setter
public class SessionManager {

    private Session session;
    private ValidServicesList servicesList;
    private TransactionQueue transactionQueue;
    private File summaryFile;

    public SessionManager(String validServicesFilePath, String summaryFilePath) {

        this.session = new NoSession();
        this.summaryFile = new File(summaryFilePath);
        this.transactionQueue = new TransactionQueue();
        File validServicesFile = new File(validServicesFilePath);
        this.servicesList = new ValidServicesList(validServicesFile);
    }

    public void operate() {
        
    }
}