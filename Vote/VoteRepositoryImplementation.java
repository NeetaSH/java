package com.xworkz.vote.repository;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.vote.dto.VoteDto;

public class VoteRepositoryImplementation implements VoteRepository{

    VoteDto []dtos = new VoteDto[5];
    int index =0 ;
    public boolean save(VoteDto voteDto){
        System.out.println("save opeartion started");
        if (index <dtos.length) {
            dtos[index] = voteDto;
          index++;
            System.out.println("saved successfully");
            return true;
        }
        return false;

    }
     @Override
    public  VoteDto[] readAll(){
        System.out.println("read operation");
        return dtos;
    }


}
