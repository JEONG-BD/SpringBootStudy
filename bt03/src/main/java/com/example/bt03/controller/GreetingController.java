package com.example.bt03.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Value("${greeting-name} : Mirage")
    private String name;

    @Value ("${greeting-coffee : ${greeting-name} is drinking cafe cereza}")
    private String coffee;

    @GetMapping
    String getGreeting(){
        return name;
    }

    @GetMapping("/coffee")
    String getCoffee(){
        return coffee;
    }


}
