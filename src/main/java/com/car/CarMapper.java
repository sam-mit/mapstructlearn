package com.car;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

  CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

  /**
   * @param car
   * example fit "car" to "myCar"
   * @return
   */
//  @Mapping(source = "numberOfSeats", target = "seatCount")
  @Mapping(target = "seatCount", source = "numberOfSeats")
  @Mapping(target = "listOfItems", source = "listOfParts")
  @Mapping(target = "myCar", source = "car")
  CarDTO carToCarDTO(Car car);
}


