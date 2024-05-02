package com.xworkz.river.repository;

import com.xworkz.river.dto.RiverDto;

public class RiverRepositoryImplementation implements  RiverRepository{

    RiverDto []dtos= new RiverDto[4];
    int index = 0;

    public  boolean save(RiverDto riverDto){
        System.out.println("save operation started");
        if(index < dtos.length){
            dtos[index] = riverDto;
          index++;
            System.out.println("saved successfully");
            return true;
        }
        return false;
    }

    public RiverDto[] readAll(){
        System.out.println("read all");
        return dtos;
    }
}
