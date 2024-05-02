package com.xworkz.vote.tester;

import com.xworkz.vote.constant.VoterId;
import com.xworkz.vote.dto.VoteDto;
import com.xworkz.vote.service.VoteService;
import com.xworkz.vote.service.VoteServiceImplementation;

public class VoteTester {
    public static void main(String[] args) {
        VoteDto voteDto = new VoteDto(VoterId.BVGSFSDYGE.toString() , "23/05/2024" , "26/07/2024");
        System.out.println(voteDto);

        VoteService voteServiceImplementation  = new VoteServiceImplementation();
        boolean validate = voteServiceImplementation.validateAndSave(voteDto);
        System.out.println(validate);

        voteServiceImplementation.validateAndSave(voteDto);
        voteServiceImplementation.readAll();
    }
}
