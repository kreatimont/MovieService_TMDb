package com.joulis1derful.movieinfo.service;

import com.joulis1derful.movieinfo.entity.Movie;
import com.joulis1derful.movieinfo.repository.MovieRepository;
import com.joulis1derful.movieinfo.util.ParseMovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository repository;

    @Override
    public List<Movie> getAll(String searchName) {
        return ParseMovieInfo.getMovies(searchName);
    }

    @Override
    public Movie getByID(int id) {
        if(repository.findOne(id) != null) {
            return repository.findOne(id);
        }
        Movie movie = ParseMovieInfo.getMovieById(id);
        save(movie);
        return movie;
    }

    @Override
    public Movie save(Movie remind) {
        return repository.saveAndFlush(remind);
    }

    @Override
    public void remove(int id) {
        repository.delete(id);
    }
}
