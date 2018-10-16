package moco.qiesfrontend;

import java.util.logging.Level;

import lombok.extern.java.Log;
import moco.qiesfrontend.session.SessionManager;

@Log
public class FrontEnd {

    public static void main(String[] args) {
        int exitCode = 0;
        log.log(Level.INFO, "Something happened");

        if (args.length != 2) {
            log.log(Level.SEVERE, "Incorrect number of arguments");
            exitCode = 1;
            System.exit(exitCode);
        }

        SessionManager sessionManager = new SessionManager(args[1], args[2]);
        sessionManager.operate();

        System.exit(exitCode);
    }
}
