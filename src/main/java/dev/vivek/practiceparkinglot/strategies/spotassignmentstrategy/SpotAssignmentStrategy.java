package dev.vivek.practiceparkinglot.strategies.spotassignmentstrategy;

import dev.vivek.practiceparkinglot.models.EntryGate;
import dev.vivek.practiceparkinglot.models.ParkingLot;
import dev.vivek.practiceparkinglot.models.ParkingSpot;
import dev.vivek.practiceparkinglot.models.SpotType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot,
                           SpotType spotType,
                           EntryGate entryGate);
}
