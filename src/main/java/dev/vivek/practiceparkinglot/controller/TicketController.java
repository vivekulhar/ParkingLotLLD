package dev.vivek.practiceparkinglot.controller;

import dev.vivek.practiceparkinglot.dtos.GenerateTicketRequestDto;
import dev.vivek.practiceparkinglot.dtos.GenerateTicketResponseDto;
import dev.vivek.practiceparkinglot.service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){
         return null;
    }
}
