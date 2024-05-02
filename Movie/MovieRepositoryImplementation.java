package com.xworkz.movie.repository;

import com.xworkz.movie.dto.MovieDto;

public class MovieRepositoryImplementation implements  MovieRepository{

            MovieDto []dtos = new MovieDto[5];
            int index=0 ;
             public  boolean save(MovieDto movieDto){
                 System.out.println("save operation started");
                 if(index < dtos.length){
                     dtos[index] = movieDto;
                     index++;
                     System.out.println("saved successfully");
                     return true;
                 }
                 return false;

             }

             @Override
    public MovieDto[] readAll(){
                 System.out.println("read all");
                 return dtos;
             }
}
