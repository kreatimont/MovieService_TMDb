package com.joulis1derful.movieinfo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Movie")
public class Movie implements Serializable {
    @Id
    private int id;

    @Column
    private String title;

    @Column
    private boolean adult;

    @Column(name = "backdrop_path")
    private String backdrop_path;

    @Column
    private int budget;

    @Column
    private String genres;

    @Column
    private String homepage;

    @Column(name = "imdb_id")
    private String imdbId;

    @Column(name = "original_language")
    private String original_language;

    @Column(name = "original_title")
    private String original_title;

    @Column
    private String overview;

    @Column
    private double popularity;

    @Column(name = "poster_path")
    private String poster_path;


    @Column(name = "release_date")
    private String release_date;

    @Column
    private int revenue;

    @Column
    private int runtime;

    @Column
    private String status;

    @Column
    private String tagline;

    @Column
    private boolean video;

    @Column(name = "vote_average")
    private double vote_average;

    @Column(name = "vote_count")
    private int vote_count;


    public Movie() {
    }

    public Movie(int id, String title, boolean adult, String backdrop_path, int budget, String genres, String homepage, String imdbId, String original_language, String original_title, String overview, double popularity, String poster_path, String release_date, int revenue, int runtime, String status, String tagline, boolean video, double vote_average, int vote_count) {
        this.id = id;
        this.title = title;
        this.adult = adult;
        this.backdrop_path = backdrop_path;
        this.budget = budget;
        this.genres = genres;
        this.homepage = homepage;
        this.imdbId = imdbId;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.revenue = revenue;
        this.runtime = runtime;
        this.status = status;
        this.tagline = tagline;
        this.video = video;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
    }

    public Movie(int id, String title, boolean adult, String backdrop_path, String original_language, String original_title, String overview, double popularity, String poster_path, String release_date, boolean video, double vote_average, int vote_count) {
        this.id = id;
        this.title = title;
        this.adult = adult;
        this.backdrop_path = backdrop_path;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.video = video;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public int getBudget() {
        return budget;
    }

    public String getGenres() {
        return genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public int getRevenue() {
        return revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public String getStatus() {
        return status;
    }

    public String getTagline() {
        return tagline;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVote_average() {
        return vote_average;
    }

    public int getVote_count() {
        return vote_count;
    }
}
