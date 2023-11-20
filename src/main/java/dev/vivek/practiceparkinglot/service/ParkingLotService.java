package dev.vivek.practiceparkinglot.service;

import dev.vivek.practiceparkinglot.models.ParkingLot;
import dev.vivek.practiceparkinglot.repositories.ParkingLotRepository;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot){
        return parkingLotRepository.save(parkingLot);
    }

    public ParkingLot updateAddress(Long id, String newAddress){
        // 1, Get Current Parking lot
//        2. Update the address
//                3. Save
//            4. Return

        ParkingLot currentParkingLot = parkingLotRepository.getById(id);
        currentParkingLot.setAddress(newAddress);
        ParkingLot updatedParkingLot = parkingLotRepository.update(id,currentParkingLot);
        return updatedParkingLot;
    }
}
