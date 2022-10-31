package com.example.saidabot;

import com.example.saidabot.Model.CustomerCare100.Level0;
import com.example.saidabot.Repository.Level0_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Level0DB_Runner implements CommandLineRunner {

    @Autowired
    Level0_Repository level0Repository;

    @Override
    public void run(String... args) throws Exception {
        level0Repository.save(new Level0(1,"SIM Registration Update"));
    }
}
