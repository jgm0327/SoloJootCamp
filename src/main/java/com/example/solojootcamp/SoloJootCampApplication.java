package com.example.solojootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SoloJootCampApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoloJootCampApplication.class, args);
    }

}
