package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.repository.TicketRepository;
import com.xworkz.ticket.repository.TicketRepositoryImplementation;

public  class TicketServiceimplementation implements TicketService{

   TicketRepository ticketRepository =  new TicketRepositoryImplementation();

   @Override
    public boolean validateAndSave(TicketDto ticketDto){
     if(ticketDto!= null){
         System.out.println("not bull");
      if(ticketDto.getDestination()!= null && ticketDto.getDeparture()!=null && ticketDto.getPrice()>0){
          System.out.println("dto is not null");
          if(isPresent(ticketDto) == false){
              boolean save = ticketRepository.save(ticketDto);
              System.out.println(save);
              if(save){
                  return true;
              }
          }
        else {
              System.out.println(" dto is null");
          }
      }
     }
     return false;
    }

    @Override
    public void ticket() {

    }


    @Override
    public void readAll(){
     TicketDto[] ticketDtos = ticketRepository.readAll();
   if(ticketDtos != null){
       for(TicketDto dto : ticketDtos){
           System.out.println(dto);
       }
   }
    }
@Override
    public boolean isPresent(TicketDto ticketDto){
       TicketDto[] ticketDtos1 = ticketRepository.readAll();
       if(ticketDtos1 != null){
      for(TicketDto dto : ticketDtos1){
          if(dto == ticketDto){
              System.out.println(dto);
              return  true;
          }
      }
       }
       return false;
    }
}
