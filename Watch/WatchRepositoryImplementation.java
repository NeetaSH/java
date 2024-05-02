package com.xworkz.watch.repository;

import com.xworkz.watch.dto.WatchDto;

public class WatchRepositoryImplementation implements WatchRepository{

  WatchDto []dtos =  new WatchDto[5];
  int index = 0 ;
    public boolean save(WatchDto watchDto){
        System.out.println(" save opearation started");
        if(index< dtos.length){
            dtos[index] = watchDto;
            index++;
            System.out.println("saved successfully");
            return true;
        }
        return false;
    }
@Override
    public WatchDto[] readAll(){
        System.out.println("read all ");
        return dtos;
    }
}
