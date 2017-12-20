package com.joulis1derful.movieinfo.controller;

import com.joulis1derful.movieinfo.entity.*;
import com.joulis1derful.movieinfo.service.MovieService;
import com.joulis1derful.movieinfo.util.ParseMovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {
    @Autowired
    private MovieService service;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public List<Movie> getAllReminders(@PathVariable("name") String movieName) {
         return service.getAll(movieName);
    }
    //получить список фильмов по имени (/movie/{name})

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Movie getReminder(@PathVariable("id") int movieId) {
        return service.getByID(movieId);
    }
    //получить по айдишнику фильм (/movie/id/{id})

    @RequestMapping(value = "/del/{id}")

    public void delete(@PathVariable int id) {
        service.remove(id);
    }
}
