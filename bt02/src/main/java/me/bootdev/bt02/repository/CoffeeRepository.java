package me.bootdev.bt02.repository;

import me.bootdev.bt02.domain.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
