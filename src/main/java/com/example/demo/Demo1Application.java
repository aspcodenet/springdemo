package com.example.demo;

import com.example.demo.models.Player;
import com.example.demo.models.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {
    @Autowired
    private PlayerRepository playerRepository;


    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            //INSRET
//            Player player = new Player();
//            player.setFirstname("John");
//            player.setLastname("Doe");
//            player.setJersey(21);
//            playerRepository.save(player);
            for(Player player : playerRepository.findAll()) {
                System.out.println(player.getFirstname() + " " + player.getLastname());
            }
       };
    }

}
