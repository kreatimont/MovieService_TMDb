package com.joulis1derful.movieinfo.service;

import com.joulis1derful.movieinfo.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Override
    public List<Person> getAll(String searchName) {
        return null;
    }

    @Override
    public Person getByID(int id) {
        return null;
    }

    @Override
    public Person save(Person remind) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
