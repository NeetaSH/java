package com.xworkz.ticket.tester;

import com.xworkz.ticket.constant.Destination;
import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.service.TicketService;
import com.xworkz.ticket.service.TicketServiceimplementation;

public class TicketTester {
    public static void main(String[] args) {
      TicketDto ticketDto = new TicketDto(Destination.RRNAGAR.toString(), "indiranagar" , 45);
        System.out.println(ticketDto);

        TicketService ticketServiceimplementation = new TicketServiceimplementation();
        boolean validate = ticketServiceimplementation.validateAndSave(ticketDto);
        System.out.println(validate);

        ticketServiceimplementation.validateAndSave(ticketDto);
        ticketServiceimplementation.readAll();
    }
}
