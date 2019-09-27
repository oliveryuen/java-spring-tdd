package com.oliveryuen.java.springboot.tdd.controllers;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.oliveryuen.java.springboot.tdd.Coffee;
import com.oliveryuen.java.springboot.tdd.services.CoffeeService;

//@Ignore
@RunWith(SpringRunner.class)
// this will not start the real server like SpringBootTest
@WebMvcTest(CoffeeController.class)
public class CoffeeControllerTest {
  
  // this comes with @WebMvcTest
  @Autowired
  private MockMvc mockMvc;
  
  @MockBean
  private CoffeeService coffeeService;
  
  @Test
  public void getCoffee_returnCoffee() throws Exception {
    given(coffeeService.getCoffee(Mockito.anyString(), Mockito.anyString())).willReturn(new Coffee("Starbucks", "Blonde"));
    
    mockMvc.perform(MockMvcRequestBuilders.get("/coffee/starbucks/blonde"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("brand").value("Starbucks"))
      .andExpect(jsonPath("name").value("Blonde"));
    
  }

}
