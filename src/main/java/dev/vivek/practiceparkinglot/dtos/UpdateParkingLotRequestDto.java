package dev.vivek.practiceparkinglot.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateParkingLotRequestDto {
    private String address;
    private Long parkingLotId;
}
