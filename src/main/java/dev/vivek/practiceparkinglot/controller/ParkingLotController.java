package dev.vivek.practiceparkinglot.controller;

import dev.vivek.practiceparkinglot.dtos.*;
import dev.vivek.practiceparkinglot.models.ParkingFloor;
import dev.vivek.practiceparkinglot.models.ParkingLot;
import dev.vivek.practiceparkinglot.service.ParkingLotService;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotController {
    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public CreateParkingLotResponseDto createParkingLotResponseDto(
            CreateParkingLotRequestDto requestDto
    ){
        if(requestDto.getNumberOfFloors()<2){
            CreateParkingLotResponseDto responseDto = new CreateParkingLotResponseDto();
            responseDto.setResponseStatusDto(ResponseStatusDto.FAILURE);
            return responseDto;
        }
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(requestDto.getAddress());
        List<ParkingFloor> parkingFloorList = new ArrayList<>();

        for(int i=0; i< requestDto.getNumberOfFloors(); i++){
            parkingFloorList.add(new ParkingFloor());
        }
        parkingLot.setParkingFloorList(parkingFloorList);
        ParkingLot createdParkingLot = parkingLotService.createParkingLot(parkingLot);
        CreateParkingLotResponseDto responseDto = new CreateParkingLotResponseDto();
        responseDto.setParkingLot(createdParkingLot);
        responseDto.setResponseStatusDto(ResponseStatusDto.SUCCESS);
        return responseDto;
    }

    public UpdateParkingLotResponseDto updateAddress(
            UpdateParkingLotRequestDto requestDto)
    {
        ParkingLot updatedParkingLot = parkingLotService.updateAddress(
                requestDto.getParkingLotId(), requestDto.getAddress());
        UpdateParkingLotResponseDto responseDto = new UpdateParkingLotResponseDto();
        responseDto.setParkingLot(updatedParkingLot);
        responseDto.setResponseStatusDto(ResponseStatusDto.SUCCESS);
        return responseDto;
    }
}
