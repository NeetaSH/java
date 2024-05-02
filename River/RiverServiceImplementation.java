package com.xworkz.river.service;

import com.xworkz.river.dto.RiverDto;
import com.xworkz.river.repository.RiverRepository;
import com.xworkz.river.repository.RiverRepositoryImplementation;

public class RiverServiceImplementation implements RiverService{

      RiverRepository riverRepository =  new RiverRepositoryImplementation();

      @Override
    public boolean validateandsave(RiverDto riverDto){
        if(riverDto != null) {
            System.out.println("not null");
            if(riverDto.getRiverName()!= null && riverDto.getRiverOrigin()!= null && riverDto.getRiverLength()>0){
                System.out.println(" dto is not null");
                if(isPresent(riverDto) == false){
                    boolean save  = riverRepository.save(riverDto);
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
        RiverDto[] riverDtos = riverRepository.readAll();
        if(riverDtos != null) {
        for(RiverDto dto : riverDtos){
            System.out.println(dto);
        }
        }
    }
    @Override
    public boolean isPresent(RiverDto riverDto){
          RiverDto[] riverDtos1 = riverRepository.readAll();
          if(riverDtos1 != null){
              for(RiverDto dto : riverDtos1){
             if(dto == riverDto){
                 System.out.println(dto);
                 return true;
             }
              }
          }
          return false;
    }
}
