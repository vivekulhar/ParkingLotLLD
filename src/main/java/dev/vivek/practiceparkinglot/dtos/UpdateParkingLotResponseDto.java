package dev.vivek.practiceparkinglot.dtos;

import dev.vivek.practiceparkinglot.models.ParkingLot;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateParkingLotResponseDto extends ResponseDto{
    private ParkingLot parkingLot;
}
