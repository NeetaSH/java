package com.xworkz.movie.tester;

import com.xworkz.movie.constant.MovieName;
import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.MovieServiceImplementation;

public class MovieTester {

    public static void main(String[] args) {

      MovieDto movieDto = new MovieDto(MovieName.KGF.toString() , 150 , "rr nagar");
        System.out.println(movieDto);

      MovieService movieServiceImplementation = new MovieServiceImplementation();
     boolean validate = movieServiceImplementation.validateandSave(movieDto);
        System.out.println(validate);

        movieServiceImplementation.validateandSave(movieDto);
        movieServiceImplementation.readAll();
    }
}
