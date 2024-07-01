package com.example.bt03.controller;

import com.example.bt03.domain.Coffee;
import com.example.bt03.repository.CoffeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    private CoffeeRepository coffeeRepository;

    public CoffeeController(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
    }

    @GetMapping
    Iterable<Coffee> allCoffees(){

        return coffeeRepository.findAll();
    }

    @GetMapping("/id")
    Optional<Coffee> findCoffeeById(@PathVariable String id){

        return coffeeRepository.findById(id);
    }

    @PostMapping
    Coffee addCoffee(@RequestBody  Coffee coffee){

        return coffeeRepository.save(coffee);

    }

    @PutMapping("/{id}")
    Coffee updateCoffee(@PathVariable String id, Coffee coffee){


        return (!coffeeRepository.existsById(id))?
                new ResponseEntity<>(coffeeRepository.save(coffee),
                        HttpStatus.CREATED).getBody()
                : new ResponseEntity<>(coffeeRepository.save(coffee),
                HttpStatus.OK).getBody();
    }

}
