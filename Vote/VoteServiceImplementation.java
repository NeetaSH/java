package com.xworkz.vote.service;

import com.xworkz.vote.dto.VoteDto;
import com.xworkz.vote.repository.VoteRepository;
import com.xworkz.vote.repository.VoteRepositoryImplementation;

public class VoteServiceImplementation implements  VoteService{

   VoteRepository voteRepository= new VoteRepositoryImplementation();
    public boolean validateAndSave(VoteDto voteDto){
        if(voteDto != null){
            System.out.println("not null");
            if(voteDto.getVoterId()!= null && voteDto.getVoteDate()!= null && voteDto.getVoteResultDate()!= null){
                System.out.println(" dto is not null");
                if(isPresent(voteDto) == false){
                    boolean save = voteRepository.save(voteDto);
                    System.out.println(save);
                    if(save){
                        return  true;
                    }
                }
               else {
                    System.out.println("dto is null");
                }

            }
        }
        return false;
    }

    public  void readAll(){
     VoteDto[] voteDtos = voteRepository.readAll();
    if(voteDtos != null){
        for(VoteDto dto : voteDtos){
            System.out.println(dto);
        }
    }
    }

    public boolean isPresent(VoteDto voteDto){
     VoteDto[] dtos = voteRepository.readAll();
      if(dtos != null){
          for(VoteDto dto : dtos) {
              if (dto == voteDto) {
                  System.out.println("already present");
                  return true;
              }
          }
      }
      return false;
    }
}
