package com.oliveryuen.java.springboot.tdd;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class AppTest {
  
  @Autowired
  private TestRestTemplate restTemplate;
  
  @Test
  public void testCoffee_returnCoffeeDetails() throws Exception {
    // arrange
    
    // act
    ResponseEntity<Coffee> response = restTemplate.getForEntity("/coffee/starbucks/blonde", Coffee.class);
    
    // assert
    Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    Assertions.assertThat(response.getBody().getBrand()).isEqualTo("Starbucks");
    Assertions.assertThat(response.getBody().getName()).isEqualTo("Blonde");
  }
  
}
