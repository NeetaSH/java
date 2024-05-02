package com.xworkz.ticket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class TicketDto {

    private String destination;
    private String departure;
    private  int price;

    @Override
    public String toString(){
        return "destination : " + destination + " , " + "departure : " + departure + " , " + "price : " + price;
    }
}
