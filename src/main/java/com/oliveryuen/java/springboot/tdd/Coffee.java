package com.oliveryuen.java.springboot.tdd;

public class Coffee {
  
  private String brand;
  private String name;
  private String origin;
  private String description;
  
  public Coffee(String brand, String name) {
    this.brand = brand;
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public String getName() {
    return name;
  }

  public String getOrigin() {
    return origin;
  }

  public String getDescription() {
    return description;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void setOrigin(String origin) {
    this.origin = origin;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }

}
