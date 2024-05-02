package com.xworkz.printer.repository;

import com.xworkz.printer.dto.PrinterDto;

public class PrinterRepositoryImplementation implements  PrinterRepository{
      PrinterDto []dtos =  new PrinterDto[4];
      int index=0;

      @Override
    public boolean save(PrinterDto printerDto){
        System.out.println(" save operation started");
        if(index< dtos.length){
            dtos[index] = printerDto;
            index ++;
            System.out.println("saved succefully");
            return true;
        }
        return false;
    }

    @Override
    public PrinterDto[] readAll(){
        System.out.println("read all");
        return dtos;
    }
}
