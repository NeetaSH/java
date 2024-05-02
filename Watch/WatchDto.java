package com.xworkz.watch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WatchDto {
    private String brand;
    private int price;
    private String type;

    public String toString(){
        return "brand : " + brand + " , " + "price : " + price + " , " + "type : " + type;
    }
}
