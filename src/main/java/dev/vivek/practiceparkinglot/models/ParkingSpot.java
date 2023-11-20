package dev.vivek.practiceparkinglot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ParkingSpot {
    private int spotNumber;
    private ParkingFloor parkingFloor;
    private SpotType spotType;
    private ParkingSpotStatus parkingSpotStatus;

    public ParkingSpot(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}
