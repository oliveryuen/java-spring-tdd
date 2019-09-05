package com.oliveryuen.java.springboot.tdd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oliveryuen.java.springboot.tdd.Greeting;
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
  
  @RequestMapping("/greeting")
  public Greeting getGreeting() {
    return new Greeting(1L, "Oliver");
  }
  
  /**
  @GetMapping("/coffee/{brand}/{name}")
  public Coffee getCoffee(@PathVariable String brand, @PathVariable String name) {
    return coffeeService.getCoffee("Starbucks", "Blonde");
  }*/

}
