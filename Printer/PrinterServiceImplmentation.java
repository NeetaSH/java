package com.xworkz.printer.service;

import com.xworkz.printer.dto.PrinterDto;
import com.xworkz.printer.repository.PrinterRepository;
import com.xworkz.printer.repository.PrinterRepositoryImplementation;

public class PrinterServiceImplmentation implements PrinterService{


  PrinterRepository printerRepository =  new PrinterRepositoryImplementation();


     @Override
    public boolean validateAndSave(PrinterDto printerDto){
     if(printerDto != null){
         System.out.println(" not null");
      if(printerDto.getPrinterBrand()!= null && printerDto.getModelNumber()>0 && printerDto.getPrinterColour()!= null ){
          System.out.println(" dto is not null");
          if(isPresent(printerDto) == false){
              boolean save= printerRepository.save(printerDto);
              System.out.println(save);
              if(save){
                  return  true;
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
    public void readAll(){
        PrinterDto[] cartoonsDto =   printerRepository.readAll();
        if(cartoonsDto!= null){
            for(PrinterDto dto : cartoonsDto){
                System.out.println(dto);
            }
        }
    }

    @Override
    public boolean isPresent(PrinterDto cartoonsDto){
        PrinterDto[] cartoonsDto1 =   printerRepository.readAll();
        if(cartoonsDto1 != null){
            for(PrinterDto dto :cartoonsDto1 ){
                if(dto == cartoonsDto){
                    System.out.println("Already Present");
                    return true;
                }
            }

        }
        return false;
    }
}
