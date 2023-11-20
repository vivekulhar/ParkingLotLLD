package dev.vivek.practiceparkinglot;

import dev.vivek.practiceparkinglot.controller.ParkingLotController;
import dev.vivek.practiceparkinglot.dtos.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticeParkingLotApplication {

	public static void main(String[] args) {

		SpringApplication.run(PracticeParkingLotApplication.class, args);
		ObjectRegistryBuilder.buildObjectRegistry();
		ParkingLotController parkingLotController = (ParkingLotController) ObjectRegistry.get("parkingLotController");
		CreateParkingLotRequestDto request = new CreateParkingLotRequestDto();
		request.setAddress("Delhi Airport");
		request.setNumberOfFloors(4);

		CreateParkingLotResponseDto response =
				parkingLotController.createParkingLotResponseDto(request);

		if (response.getResponseStatusDto().equals(ResponseStatusDto.FAILURE)) {
			System.out.println("Something is wrong");
		} else {
			System.out.println(response.getParkingLot());
		}

		UpdateParkingLotRequestDto updateParkingLotRequest = new UpdateParkingLotRequestDto();
		updateParkingLotRequest.setParkingLotId(1L);
		updateParkingLotRequest.setAddress("Noida");

		UpdateParkingLotResponseDto responseDto = parkingLotController.updateAddress(updateParkingLotRequest);

		System.out.println(responseDto);
	}

}
