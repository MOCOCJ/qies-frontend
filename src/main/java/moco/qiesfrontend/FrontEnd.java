package moco.qiesfrontend;

import java.util.logging.Level;

import lombok.extern.java.Log;

@Log
public class FrontEnd {

    public static void main(String[] args) {
        int exitCode = 0;

        log.log(Level.INFO, "Something happened");
        log.log(Level.INFO, args[0]);
        log.log(Level.INFO, args[1]);

        System.exit(exitCode);
    }
}
