package com.car;



public enum CarType {

  BMW("BMW"),
  AUDI("AUDI"),
  SEDAN("Morris");

  private String carType;


  CarType (String carType) {
    this.carType = carType;
  }
  @Override
  public String toString() {
    return this.carType;
  }
}
