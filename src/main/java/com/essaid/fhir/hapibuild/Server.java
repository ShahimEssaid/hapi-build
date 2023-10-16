package com.essaid.fhir.hapibuild;

import ca.uhn.fhir.jpa.starter.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({Application.class})
public class Server {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Server.class, args);
    }
}
