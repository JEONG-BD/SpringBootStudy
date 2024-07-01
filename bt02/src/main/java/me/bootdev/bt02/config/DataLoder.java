package me.bootdev.bt02.config;

import jakarta.annotation.PostConstruct;
import me.bootdev.bt02.domain.Coffee;
import me.bootdev.bt02.repository.CoffeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoder {
    private final CoffeeRepository coffeeRepository;


    public DataLoder(CoffeeRepository coffeeRepository) {
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
