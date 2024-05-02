package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDto;

public interface MovieService {

    boolean validateandSave(MovieDto movieDto);

    void readAll();

    boolean isPresent(MovieDto movieDto);
}
