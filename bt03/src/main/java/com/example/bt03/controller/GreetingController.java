package com.example.bt03.controller;

import com.example.bt03.domain.Greeting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final Greeting greeting;

    public GreetingController(Greeting greeting){
        this.greeting = greeting;
    }

//    @Value("${greeting-name} : Mirage")
//    private String name;
//
//    @Value ("${greeting-coffee : ${greeting-name} is drinking cafe cereza}")
//    private String coffee;

    @GetMapping
    String getGreeting(){
        return greeting.getName();
    }

    @GetMapping("/coffee")
    String getCoffee(){
        return greeting.getCoffee();
    }


}
