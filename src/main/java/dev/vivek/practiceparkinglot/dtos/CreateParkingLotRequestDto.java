package dev.vivek.practiceparkinglot.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateParkingLotRequestDto {
    String address;
    int numberOfFloors;
}
