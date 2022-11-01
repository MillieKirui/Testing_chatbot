package com.example.saidabot;

import com.example.saidabot.Model.CustomerCare100.Level0;
import com.example.saidabot.Model.CustomerCare100.Level1;
import com.example.saidabot.Repository.Level0_Repository;
import com.example.saidabot.Repository.Level1_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaidaBotApplication  implements CommandLineRunner{

    @Autowired
    Level0_Repository level0Repository;

    @Autowired
    Level1_Repository level1Repository;


    public static void main(String[] args) {
        SpringApplication.run(SaidaBotApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        level0Repository.save(new Level0(0,"SIM Registration Update"));
        level0Repository.save(new Level0(1,"Reset Airtel Money PIN"));
        level0Repository.save(new Level0(2,"My Account"));
        level0Repository.save(new Level0(3,"Kaa Chonjo! Report Fraud"));
        level0Repository.save(new Level0(4,"Find Airtel Shop"));
        level0Repository.save(new Level0(5,"Get Postpaid, Mifi/Router "));


        level1Repository.save(new Level1(1.1,"Set Security Question"));
        level1Repository.save(new Level1(1.2,"Change pin"));
        level1Repository.save(new Level1(1.3,"View Security Question"));
        level1Repository.save(new Level1(1.4,"Change Security Question"));
        level1Repository.save(new Level1(1.5,"Reset PIN/Forgot PIN"));
    }

}
