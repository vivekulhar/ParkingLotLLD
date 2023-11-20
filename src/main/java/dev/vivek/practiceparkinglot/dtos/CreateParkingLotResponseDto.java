package dev.vivek.practiceparkinglot.dtos;

import dev.vivek.practiceparkinglot.models.ParkingLot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateParkingLotResponseDto extends ResponseDto{
    private ParkingLot parkingLot;
    private ResponseStatusDto responseStatusDto;

}
