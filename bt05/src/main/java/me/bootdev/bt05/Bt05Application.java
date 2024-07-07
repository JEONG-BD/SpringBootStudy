package me.bootdev.bt05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Bt05Application {

    public static void main(String[] args) {
        SpringApplication.run(Bt05Application.class, args);
    }

}
