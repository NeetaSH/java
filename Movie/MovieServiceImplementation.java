package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.repository.MovieRepository;
import com.xworkz.movie.repository.MovieRepositoryImplementation;

public class MovieServiceImplementation implements  MovieService{


          MovieRepository movieRepository = new MovieRepositoryImplementation();
     @Override
    public boolean validateandSave(MovieDto movieDto){
        if(movieDto != null) {
            System.out.println("not null");
            if(movieDto.getMovieName()!= null && movieDto.getTicketPrice()>0 && movieDto.getLocation()!=null){
                System.out.println("dto is not null");
                if(isPresent(movieDto)== false){
                    boolean save = movieRepository.save(movieDto);
                    System.out.println(save);
                    if(save){
                        return true;

                    }
                }
              else {
                    System.out.println(" dto is null");

                }

            }

        }
        return false;
    }

    @Override
    public void readAll(){
       MovieDto[] movieDtos =  movieRepository.readAll();
       if(movieDtos != null){
           for(MovieDto dto : movieDtos){
               System.out.println(dto);

           }
       }
    }

    @Override
    public boolean isPresent(MovieDto movieDto){
         MovieDto[] movieDtos1 = movieRepository.readAll();
         if(movieDtos1 != null ){
          for(MovieDto dto : movieDtos1){
              if(dto == movieDto){
                  System.out.println(dto);
                  return true;
              }
          }
         }
         return  false;
    }
}
