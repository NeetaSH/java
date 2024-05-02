package com.xworkz.river.repository;

import com.xworkz.river.dto.RiverDto;

public interface RiverRepository {

    boolean save(RiverDto riverDto);

    RiverDto[] readAll();
}
