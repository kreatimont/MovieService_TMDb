package com.joulis1derful.movieinfo.service;

import com.joulis1derful.movieinfo.entity.Movie;
import com.joulis1derful.movieinfo.entity.Person;
import com.joulis1derful.movieinfo.repository.MovieRepository;
import com.joulis1derful.movieinfo.repository.PeopleRepository;
import com.joulis1derful.movieinfo.util.ParseMovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleRepository repository;

    @Override
    public List<Person> getAll(String searchName) {
        return ParseMovieInfo.getPeople(searchName);
    }

    @Override
    public Person getByID(int id) {
        if(repository.findOne(id) != null) {
            return repository.findOne(id);
        }
        Person person = ParseMovieInfo.getPersonById(id);
        save(person);
        return person;
    }

    @Override
    public Person save(Person person) {
        return repository.saveAndFlush(person);
    }

    @Override
    public void remove(int id) {
        repository.delete(id);
    }
}
