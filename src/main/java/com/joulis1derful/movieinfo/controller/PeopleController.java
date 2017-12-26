package com.joulis1derful.movieinfo.controller;

import com.joulis1derful.movieinfo.entity.Person;
import com.joulis1derful.movieinfo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/people")
public class PeopleController {
    @Autowired
    private PeopleService service;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public List<Person> getAllReminders(@PathVariable("name") String personName) {
        return service.getAll(personName);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Person getReminder(@PathVariable("id") int personId) {
        return service.getByID(personId);
    }

    @RequestMapping(value = "/del/{id}")
    public void delete(@PathVariable int id) {
        service.remove(id);
    }

}
