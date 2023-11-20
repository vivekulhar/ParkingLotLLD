package dev.vivek.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private List<ParkingSpot> parkingSpotList;
    private int floorNumber;
}
