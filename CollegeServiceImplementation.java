package com.xworkz.college.service;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.repository.CollegeRepository;
import com.xworkz.college.repository.CollegeRepositoryImplementation;

public class CollegeServiceImplementation implements CollegeService {
        CollegeRepository collegeRepository =   new CollegeRepositoryImplementation();
    public boolean validateAndSave(CollegeDto collegeDto){
        if(collegeDto != null){
            System.out.println("not null");
            if(collegeDto.getCollegeName()!= null && collegeDto.getStudentName() != null && collegeDto.getNoOfCollege()>0){
                System.out.println("dto is not null");
                if(isPresent(collegeDto) == false){
                    boolean save = collegeRepository.save(collegeDto);
                    System.out.println("saved" + save);
                    if(save){
                        return true;

                    }
                }
             else {
                    System.out.println("dto is null");
                }

            }

        }
        return false;
    }

    @Override
    public void readAll(){
      CollegeDto[] collegeDtos =  collegeRepository.readAll();
      if(collegeDtos != null){
          for(CollegeDto dto : collegeDtos){
              System.out.println(dto);
          }
      }
    }

    @Override
    public boolean isPresent(CollegeDto collegeDto){
      CollegeDto[] collegeDtos =  collegeRepository.readAll();
      if(collegeDtos!= null){
          for(CollegeDto dto : collegeDtos){
              if(dto == collegeDto){
                  System.out.println(dto);
                  return true;
              }
          }
      }
      return false;
    }
}
