package com.car;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

  CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

//  @Mapping(source = "numberOfSeats", target = "seatCount")
  @Mapping(target = "seatCount", source = "numberOfSeats")
  @Mapping(target = "listOfItems", source = "listOfParts")
  CarDTO carToCarDTO(Car car);
}


