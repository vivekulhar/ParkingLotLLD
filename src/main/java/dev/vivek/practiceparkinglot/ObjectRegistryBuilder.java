package dev.vivek.practiceparkinglot;

import dev.vivek.practiceparkinglot.controller.ParkingLotController;
import dev.vivek.practiceparkinglot.controller.TicketController;
import dev.vivek.practiceparkinglot.repositories.ParkingLotRepository;
import dev.vivek.practiceparkinglot.repositories.TicketRepository;
import dev.vivek.practiceparkinglot.service.ParkingLotService;
import dev.vivek.practiceparkinglot.service.TicketService;
import dev.vivek.practiceparkinglot.strategies.spotassignmentstrategy.RandomSpotAssignmentStrategy;
import dev.vivek.practiceparkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategy;

public class ObjectRegistryBuilder {

    public static void buildObjectRegistry() {
        ObjectRegistry.put("parkingLotRepository", new ParkingLotRepository());
        ObjectRegistry.put("parkingLotService", new ParkingLotService(
                (ParkingLotRepository) ObjectRegistry.get("parkingLotRepository")
        ));
        ObjectRegistry.put("parkingLotController", new ParkingLotController(
                (ParkingLotService) ObjectRegistry.get("parkingLotService")
        ));
        ObjectRegistry.put("ticketRepository", new TicketRepository());
        ObjectRegistry.put("spotAssignmentStrategy", new RandomSpotAssignmentStrategy());
        ObjectRegistry.put("ticketService", new TicketService(
                (TicketRepository) ObjectRegistry.get("ticketRepository"),
                (SpotAssignmentStrategy) ObjectRegistry.get("spotAssignmentStrategy"),
                (ParkingLotRepository) ObjectRegistry.get("parkingLotRepository")
        ));
        ObjectRegistry.put("ticketController", new TicketController(
                (TicketService) ObjectRegistry.get("ticketService")
        ));
    }
}
