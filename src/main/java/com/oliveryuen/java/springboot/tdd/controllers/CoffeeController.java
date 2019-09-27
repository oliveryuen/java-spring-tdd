package com.oliveryuen.java.springboot.tdd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oliveryuen.java.springboot.tdd.Coffee;
import com.oliveryuen.java.springboot.tdd.services.CoffeeService;

@RestController
public class CoffeeController {
  
  private CoffeeService coffeeService;
  
  public CoffeeController(CoffeeService coffeeService) {
    this.coffeeService = coffeeService;
  }
  
  @GetMapping("/")
  public String getCustomString() {
    return "{\"status\":\"ok\"}";
  }
  
  @GetMapping("/coffee/{brand}/{name}")
  public Coffee getCoffee(@PathVariable String brand, @PathVariable String name) {
    return coffeeService.getCoffee("Starbucks", "Blonde");
  }

}
