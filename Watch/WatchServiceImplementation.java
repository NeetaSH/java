package com.xworkz.watch.service;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repository.WatchRepository;
import com.xworkz.watch.repository.WatchRepositoryImplementation;

public class WatchServiceImplementation implements WatchService{
   WatchRepository watchRepository = new WatchRepositoryImplementation();
    public  boolean validateAndSave(WatchDto watchDto){
      if(watchDto != null){
          System.out.println("not null");
          if(watchDto.getBrand() !=null && watchDto.getPrice()>0 && watchDto.getType()!=null){
              System.out.println("dto is not null");
              if(isPresent(watchDto)== false){
                  boolean save = watchRepository.save(watchDto);
                  System.out.println(save);
                  if(save){
                      return true;
                  }
              }
           else {
                  System.out.println("dto is null");
              }
          }
      }
      return  false;
    }

    public void readAll(){
     WatchDto[] watchDtos = watchRepository.readAll();
     if(watchDtos != null){
         for(WatchDto dto : watchDtos){
             System.out.println(dto);
         }
     }
    }

    public boolean isPresent(WatchDto watchDto){
        WatchDto[] dto = watchRepository.readAll();
        if(dto != null){
          for(WatchDto dto1 : dto){
              if(dto1  == watchDto){
                  System.out.println("already present");
                  return true;
              }
          }
        }
        return  false;

    }
}
