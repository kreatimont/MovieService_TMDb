package com.joulis1derful.movieinfo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "People")
public class Person implements Serializable {
    @Column
    private boolean adult;

    @Column
    private String biography;

    @Column
    private String birthday;

    @Column
    private String deathday;

    @Column
    private int gender;

    @Column
    private String homepage;

    @Id
    private int id;

    @Column(name = "imdb_id")
    private String imdb_id;

    @Column
    private String name;

    @Column(name = "place_of_birth")
    private String place_of_birth;

    @Column
    private double popularity;

    @Column(name = "profile_path")
    private String profile_path;



    public Person() {
    }

    public Person(boolean adult, String biography, String birthday, String deathday, int gender, String homepage, int id, String imdb_id, String name, String place_of_birth, double popularity, String profile_path) {
        this.adult = adult;
        this.biography = biography;
        this.birthday = birthday;
        this.deathday = deathday;
        this.gender = gender;
        this.homepage = homepage;
        this.id = id;
        this.imdb_id = imdb_id;
        this.name = name;
        this.place_of_birth = place_of_birth;
        this.popularity = popularity;
        this.profile_path = profile_path;
    }

    public Person(int id, String name, List<Movie> movies) {
        this.id = id;
        this.name = name;
        //this.movies.addAll(movies);
    }

    public boolean isAdult() {
        return adult;
    }

    public String getBiography() {
        return biography;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getDeathday() {
        return deathday;
    }

    public int getGender() {
        return gender;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getId() {
        return id;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public String getName() {
        return name;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getProfile_path() {
        return profile_path;
    }
}
