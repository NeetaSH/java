package com.xworkz.watch.tester;

import com.xworkz.watch.constant.Brand;
import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImplementation;

public class WatchTester {
    public static void main(String[] args) {
      WatchDto watchDto = new WatchDto(Brand.BOAT.toString() , 4500, "wall");
        System.out.println(watchDto);

      WatchService watchServiceImplementation = new WatchServiceImplementation();
      boolean validate = watchServiceImplementation.validateAndSave(watchDto);
        System.out.println(validate);

        watchServiceImplementation.validateAndSave(watchDto);
        watchServiceImplementation.readAll();
    }
}
