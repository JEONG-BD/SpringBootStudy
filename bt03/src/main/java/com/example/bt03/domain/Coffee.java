package com.example.bt03.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Coffee {

    @Id
    private String id;
    private String name;

    public Coffee(){

    }

    public Coffee(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
