package com.example.bt07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Bt07Application {

    public static void main(String[] args) {
        SpringApplication.run(Bt07Application.class, args);
    }

}
