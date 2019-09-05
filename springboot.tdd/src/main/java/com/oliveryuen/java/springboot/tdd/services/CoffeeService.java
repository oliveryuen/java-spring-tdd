package com.oliveryuen.java.springboot.tdd.services;

import org.springframework.stereotype.Service;

import com.oliveryuen.java.springboot.tdd.Coffee;
import com.oliveryuen.java.springboot.tdd.repos.CoffeeRepository;

@Service
public class CoffeeService {
  
  private CoffeeRepository coffeeRepository;
  
  public CoffeeService(CoffeeRepository coffeeRepository) {
    this.coffeeRepository = coffeeRepository;
  }

  public Coffee getCoffee(String brand, String name) {
    Coffee coffee = new Coffee(brand, name);
    coffee.setDescription("desc");
    coffee.setOrigin("origin");
    return coffee;
  }
}
