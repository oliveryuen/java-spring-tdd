package com.oliveryuen.java.springboot.tdd.services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.oliveryuen.java.springboot.tdd.Coffee;
import com.oliveryuen.java.springboot.tdd.repos.CoffeeRepository;

@RunWith(MockitoJUnitRunner.class)
public class CoffeeServiceTest {
  
  @Mock
  private CoffeeRepository coffeeRepository;
  
  private CoffeeService coffeeService;
  
  @Before
  public void setUp() throws Exception {
    coffeeService = new CoffeeService(coffeeRepository);
  }
  
  @Test
  public void test_getCoffee_returnCoffee() throws Exception {
    assertThat(coffeeService.getCoffee("Starbucks", "Blonde"))
      .isInstanceOf(Coffee.class)
      .hasFieldOrPropertyWithValue("brand", "Starbucks")
      .hasFieldOrPropertyWithValue("name", "Blonde");
  }

}
