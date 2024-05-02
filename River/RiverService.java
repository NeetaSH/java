package com.xworkz.river.service;

import com.xworkz.river.dto.RiverDto;

public interface RiverService {

    boolean validateandsave(RiverDto riverDto);


    void readAll();

    boolean isPresent(RiverDto riverDto);
}
