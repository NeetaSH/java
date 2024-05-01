package com.xworkz.college.tester;

import com.xworkz.college.constant.CollegeName;
import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImplementation;

public class CollegeTester {

    public static void main(String[] args) {

      CollegeDto collegeDto = new CollegeDto(CollegeName.AITM.toString(),"anvith" , 5);
        System.out.println(collegeDto);
     CollegeService collegeServiceImplementation = new CollegeServiceImplementation();
     boolean validate = collegeServiceImplementation.validateAndSave(collegeDto);
        System.out.println(validate);

    }
}
