package com.example.bt03.config;

import com.example.bt03.domain.Coffee;
import com.example.bt03.repository.CoffeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    private final CoffeeRepository coffeeRepository;


    public Config(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    private void loadData(){
        coffeeRepository.saveAll(List.of(
                new Coffee("cafe bean"),
                new Coffee("cafe ediya"),
                new Coffee("cafe compose")
        ));
    }
}
