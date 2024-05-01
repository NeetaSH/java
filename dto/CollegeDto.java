package com.xworkz.college.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CollegeDto {

    private String collegeName;
    private String studentName;
    private int noOfCollege;


    @Override
    public String toString(){
        return "collegeName" + collegeName + " , " + "studentName : " + studentName + " , " + "noOfCollege" + noOfCollege;
    }

}
