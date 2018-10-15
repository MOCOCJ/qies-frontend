package moco.qiesfrontend;

import java.util.logging.Level;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.java.Log;
import moco.qiesfrontend.session.SessionManager;

@SpringBootApplication
@Log
public class FrontEnd implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FrontEnd.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.log(Level.WARNING ,"SOMETHING HAPPENED");
    }

    /* @Bean
    public SessionManager sessionManager(String validServicesFilePath, String summaryFilePath) {
        return new SessionManager(validServicesFilePath, summaryFilePath);
    } */
}
