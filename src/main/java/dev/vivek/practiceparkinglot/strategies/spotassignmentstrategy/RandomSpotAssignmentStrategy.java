package dev.vivek.practiceparkinglot.strategies.spotassignmentstrategy;

import dev.vivek.practiceparkinglot.models.*;
import dev.vivek.practiceparkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategy;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {

    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, SpotType spotType, EntryGate entryGate) {
        for(ParkingFloor parkingFloor:parkingLot.getParkingFloorList()){
            for(ParkingSpot parkingSpot: parkingFloor.getParkingSpotList()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                && parkingSpot.getSpotType().equals(spotType)){
                    return parkingSpot;
                }
            }
        }

        return null;
    }
}
