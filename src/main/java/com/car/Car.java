package com.car;


import java.util.List;

public class Car {

   public Car(String make, int i, CarType type) {
     this.make = make;
     this.numberOfSeats = i;
     this.type = type;
   }

   public String getMake() {
      return make;
   }


   public int getNumberOfSeats() {
      return numberOfSeats;
   }

   public CarType getType() {
      return type;
   }

   private String make;
   private int numberOfSeats;
   private CarType type;

   public List<String> getListOfParts() {
      return listOfParts;
   }

   public void setListOfParts(List<String> listOfParts) {
      this.listOfParts = listOfParts;
   }

   private List<String> listOfParts;

  //constructor, getters, setters etc.
}


