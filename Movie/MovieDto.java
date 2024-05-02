package com.xworkz.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class MovieDto {
    private String movieName;
    private int  ticketPrice;
    private String  location;

    @Override
    public String toString(){
        return  "movieName" + movieName + " , " + "ticketPrice" + ticketPrice + " , " + "location" + location;
    }
}
