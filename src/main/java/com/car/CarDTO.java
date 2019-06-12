package com.car;


import java.util.List;

public class CarDTO {


   public String getMake() {
      return make;
   }

   public void setMake(String make) {
      this.make = make;
   }

   public int getSeatCount() {
      return seatCount;
   }

   public void setSeatCount(int seatCount) {
      this.seatCount = seatCount;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   private String make;
   private int seatCount;
   private String type;
   private List<String> listOfItems;

   public List<String> getListOfItems() {
      return listOfItems;
   }

   public void setListOfItems(List<String> listOfItems) {
      this.listOfItems = listOfItems;
   }
}


