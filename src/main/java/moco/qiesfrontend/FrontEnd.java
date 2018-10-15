package moco.qiesfrontend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import moco.qiesfrontend.session.SessionManager;

@SpringBootApplication
public class FrontEnd implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FrontEnd.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SOMETHING HAPPENED");
    }

    @Bean
    public SessionManager sessionManager(String validServicesFilePath, String summaryFilePath) {
        return new SessionManager(validServicesFilePath, summaryFilePath);
    }
}
