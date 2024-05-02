package com.xworkz.movie.repository;

import com.xworkz.movie.dto.MovieDto;

public interface MovieRepository {

    boolean save(MovieDto movieDto);

    MovieDto[] readAll();

}
