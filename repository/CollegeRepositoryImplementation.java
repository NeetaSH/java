package com.xworkz.college.repository;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepositoryImplementation implements CollegeRepository {

        CollegeDto[] dtos = new CollegeDto[4];
        int index = 0 ;
    public boolean save(CollegeDto collegeDto){
        System.out.println("save operation started");
        if(index< dtos.length){
             index++;
            System.out.println("saved successfully");
            return  true;
        }
         return false;
    }
}
