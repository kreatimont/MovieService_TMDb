package com.joulis1derful.movieinfo.service;

import com.joulis1derful.movieinfo.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAll(String searchName);
    Movie getByID(int id);
    Movie save(Movie remind);
    void remove(int id);
}
