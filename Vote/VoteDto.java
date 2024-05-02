package com.xworkz.vote.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class VoteDto {
    private String voterId;
    private String voteDate;
    private String voteResultDate;

    public String toString(){
        return  "voterId : " + voterId + " , " + "voteDate : " + voteDate + " , " + "voteResultDate : " + voteResultDate;
    }
}
