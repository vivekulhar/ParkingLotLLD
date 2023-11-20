package dev.vivek.practiceparkinglot.dtos;

import dev.vivek.practiceparkinglot.models.EntryGate;
import dev.vivek.practiceparkinglot.models.Ticket;
import dev.vivek.practiceparkinglot.models.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketRequestDto {
    private Vehicle vehicle;
    private EntryGate entryGate;
    private Long parkingLotId;

}
