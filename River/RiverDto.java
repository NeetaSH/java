package com.xworkz.river.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RiverDto {

    private String riverName;
    private String riverOrigin;
    private int riverLength;

    @Override
    public String toString(){
        return "riverName : " + riverName + " , " + "riverOrigin" + riverOrigin + " , " + "riverLength" + riverLength;
    }
}
