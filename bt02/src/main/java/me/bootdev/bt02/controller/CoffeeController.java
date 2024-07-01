package me.bootdev.bt02.controller;


import me.bootdev.bt02.domain.Coffee;
import me.bootdev.bt02.repository.CoffeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    private final CoffeeRepository coffeeRepository;

    // private List<Coffee> coffees = new ArrayList<>();

    public CoffeeController(CoffeeRepository coffeeRepository) {

        this.coffeeRepository = coffeeRepository;

//        this.coffeeRepository.saveAll(List.of(
//                new Coffee("cafe bean"),
//                new Coffee("cafe ediya"),
//                new Coffee("cafe compose")
//                ));

//        coffees.addAll(List.of(new Coffee("cafe bean"),
//                new Coffee("cafe bene"),
//                new Coffee("cafe starbucks")
//                ));
    }

    //@RequestMapping(value = "/coffees", method = RequestMethod.GET)
    @GetMapping
    Iterable<Coffee> getCoffees(){
        // return coffees;
        return coffeeRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id){
//        return Optional.empty();
//        for(Coffee c : coffees){
//            if (c.getId().equals(id)){
//                return Optional.of(c);
//            }
//        }

        return coffeeRepository.findById(id);
    }

    @PostMapping()
    Coffee postCoffee(@RequestBody Coffee coffee) {
//        coffees.add(coffee);
//        return coffee;
        return coffeeRepository.save(coffee);
    }

    @PutMapping("/{id}")
    Coffee putCoffee(@PathVariable String id, @RequestBody Coffee coffee){
//        int coffeeIndex = -1;
//
//        for (Coffee c : coffees) {
//            if (c.getId().equals(id)){
//                coffeeIndex = coffees.indexOf(c);
//                coffees.set(coffeeIndex, coffee);
//            }
//        }
//
        //return (coffeeIndex == -1 )? postCoffee(coffee) : coffee;
//        return (coffeeIndex == - 1) ?
//                new ResponseEntity<>(postCoffee(coffee), HttpStatus.CREATED).getBody() :
//                new ResponseEntity<>(coffee, HttpStatus.OK).getBody();
//
        return (!coffeeRepository.existsById(id))?
                new ResponseEntity<>(coffeeRepository.save(coffee),
                        HttpStatus.CREATED).getBody()
                : new ResponseEntity<>(coffeeRepository.save(coffee),
                HttpStatus.OK).getBody();

    }

    @DeleteMapping("/{id}")
    void deleteCoffee(@PathVariable String id){
        //coffees.removeIf(c -> c.getId().equals(id));
        coffeeRepository.deleteById(id);
    }
}
