package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.TicketDto;

public class TicketRepositoryImplementation implements TicketRepository{

    TicketDto []dtos = new TicketDto[4];
    int index = 0 ;
    public boolean save(TicketDto ticketDto){
        System.out.println("save operation started");
        if(index< dtos.length){
         dtos[index] = ticketDto;
           index++;
            System.out.println("saved successfully");
            return true;
        }
        return false;
    }

   public TicketDto[] readAll(){
       System.out.println("read all");
       return dtos;
    }
}
