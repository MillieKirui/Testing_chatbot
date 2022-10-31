package com.example.saidabot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaidaBotApplication {

    @Autowired


    public static void main(String[] args) {
        SpringApplication.run(SaidaBotApplication.class, args);
    }

}
