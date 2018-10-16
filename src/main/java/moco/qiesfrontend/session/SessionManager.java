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
    private Input input;

    public SessionManager(String validServicesFilePath, String summaryFilePath) {

        this.session = new NoSession();
        this.summaryFile = new File(summaryFilePath);
        this.transactionQueue = new TransactionQueue();
        File validServicesFile = new File(validServicesFilePath);
        this.servicesList = new ValidServicesList(validServicesFile);
        this.input = new Input("---");
    }

    public void operate() {
        session.process(this, transactionQueue);
    }

    public void setSession(Session session) {
        if (session instanceof AgentSession) {
            this.input.setPrompt("AGENT");
        }
        if (session instanceof PlannerSession) {
            this.input.setPrompt("PLANNER");
        }
        if (session instanceof NoSession) {
            printTransactionSummary();
        }

        this.session = session;
        operate();
    }

    public void printTransactionSummary() {
        //TODO
    }
}