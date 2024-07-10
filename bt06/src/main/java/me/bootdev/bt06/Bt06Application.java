package me.bootdev.bt06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Bt06Application {

    public static void main(String[] args) {
        SpringApplication.run(Bt06Application.class, args);
    }

}
