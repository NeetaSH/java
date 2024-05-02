package com.xworkz.printer.tester;

import com.xworkz.printer.constant.PrinterBrand;
import com.xworkz.printer.dto.PrinterDto;
import com.xworkz.printer.service.PrinterService;
import com.xworkz.printer.service.PrinterServiceImplmentation;

public class PrinterTester {
    public static void main(String[] args) {
       PrinterDto printerDto = new PrinterDto(PrinterBrand.HP.toString(), 567, "black");
        System.out.println(printerDto);

     PrinterService printerServiceImplmentation =  new PrinterServiceImplmentation();
     boolean validate  = printerServiceImplmentation.validateAndSave(printerDto);
        System.out.println(validate);

        printerServiceImplmentation.validateAndSave(printerDto);
        printerServiceImplmentation.readAll();
    }
}
