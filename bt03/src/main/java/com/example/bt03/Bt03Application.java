package com.example.bt03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class Bt03Application {

    public static void main(String[] args) {
        SpringApplication.run(Bt03Application.class, args);
    }

}
