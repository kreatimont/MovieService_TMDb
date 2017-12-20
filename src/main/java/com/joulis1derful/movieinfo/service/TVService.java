package com.joulis1derful.movieinfo.service;

import com.joulis1derful.movieinfo.entity.TV;

import java.util.List;

public interface TVService {
    List<TV> getAll(String searchName);
    TV getByID(int id);
    TV save(TV remind);
    void remove(int id);
}
