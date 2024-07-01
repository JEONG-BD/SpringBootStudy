package com.example.bt03.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Droid {


    @Id
    private String name;
    private String description;

    public Droid(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
