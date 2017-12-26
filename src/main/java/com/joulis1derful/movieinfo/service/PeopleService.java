package com.joulis1derful.movieinfo.service;

import com.joulis1derful.movieinfo.entity.Person;

import java.util.List;

public interface PeopleService {
    List<Person> getAll(String searchName);
    Person getByID(int id);
    Person save(Person person);
    void remove(int id);
}
