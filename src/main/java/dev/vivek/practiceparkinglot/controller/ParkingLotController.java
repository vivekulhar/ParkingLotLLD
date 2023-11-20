package dev.vivek.practiceparkinglot.controller;

import dev.vivek.practiceparkinglot.dtos.CreateParkingLotRequestDto;
import dev.vivek.practiceparkinglot.dtos.CreateParkingLotResponseDto;
import dev.vivek.practiceparkinglot.dtos.UpdateParkingLotRequestDto;
import dev.vivek.practiceparkinglot.dtos.UpdateParkingLotResponseDto;

public class ParkingLotController {
    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public CreateParkingLotResponseDto createParkingLotResponseDto(
            CreateParkingLotRequestDto requestDto
    ){
    }

    public UpdateParkingLotResponseDto updateAddress(
            UpdateParkingLotRequestDto requestDto)
    {

    }
}
