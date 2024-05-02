package com.xworkz.printer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PrinterDto {

    private String printerBrand;
    private int modelNumber;
    private String printerColour;

    public String toString(){
        return "printerBrand : " + printerBrand + " , " + "modelNumber : " + modelNumber + " , " + "printerColour : " +printerColour;
    }
}
