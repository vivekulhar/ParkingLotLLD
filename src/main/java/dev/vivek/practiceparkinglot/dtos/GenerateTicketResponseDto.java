package dev.vivek.practiceparkinglot.dtos;

import dev.vivek.practiceparkinglot.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketResponseDto extends ResponseDto{
    private Ticket ticket;
}
