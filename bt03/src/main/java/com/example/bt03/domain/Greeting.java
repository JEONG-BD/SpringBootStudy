package com.example.bt03.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "greeting")
@Entity
public class Greeting {

    @Id
    private String name;
    private String coffee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }
}
