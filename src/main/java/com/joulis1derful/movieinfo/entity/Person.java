package com.joulis1derful.movieinfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "People")
public class Person {
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
    private String imdbId;

    @Column
    private String name;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column
    private double popularity;

    @Column(name = "profile_path")
    private String profilePath;

    public Person() {
    }

    public Person(boolean adult, String biography, String birthday, String deathday, int gender, String homepage, int id, String imdbId, String name, String placeOfBirth, double popularity, String profilePath) {
        this.adult = adult;
        this.biography = biography;
        this.birthday = birthday;
        this.deathday = deathday;
        this.gender = gender;
        this.homepage = homepage;
        this.id = id;
        this.imdbId = imdbId;
        this.name = name;
        this.placeOfBirth = placeOfBirth;
        this.popularity = popularity;
        this.profilePath = profilePath;
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

    public String getImdbId() {
        return imdbId;
    }

    public String getName() {
        return name;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getProfilePath() {
        return profilePath;
    }
}
