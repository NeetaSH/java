package com.xworkz.college.repository;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepositoryImplementation implements CollegeRepository {

        CollegeDto[] dtos = new CollegeDto[4];
        int index = 0 ;
    public boolean save(CollegeDto collegeDto){
        System.out.println("save operation started");
        if(index< dtos.length){
            dtos[index] = collegeDto;
             index++;
            System.out.println("saved successfully");
            return  true;
        }
         return false;
    }
    @Override
    public CollegeDto[] readAll(){
        System.out.println("read all");
        return dtos;
    }

}
