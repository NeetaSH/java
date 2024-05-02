package com.xworkz.river.tester;

import com.xworkz.river.constant.RiverName;
import com.xworkz.river.dto.RiverDto;
import com.xworkz.river.repository.RiverRepositoryImplementation;
import com.xworkz.river.service.RiverService;
import com.xworkz.river.service.RiverServiceImplementation;

public class RiverTester {
    public static void main(String[] args) {
       RiverDto riverDto = new RiverDto(RiverName.KRISHNA.toString() , "mahabaleshwar" , 230);
        System.out.println(riverDto);

        RiverService riverServiceImplementation = new RiverServiceImplementation();
        boolean validate = riverServiceImplementation.validateandsave(riverDto);
        System.out.println(validate);

        riverServiceImplementation.validateandsave(riverDto);
        riverServiceImplementation.readAll();

    }
}
