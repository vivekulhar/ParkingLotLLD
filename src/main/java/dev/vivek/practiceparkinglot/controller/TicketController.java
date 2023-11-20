package dev.vivek.practiceparkinglot.controller;

import dev.vivek.practiceparkinglot.dtos.GenerateTicketRequestDto;
import dev.vivek.practiceparkinglot.dtos.GenerateTicketResponseDto;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){
         return null;
    }
}
