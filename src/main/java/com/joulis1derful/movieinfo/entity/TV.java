package com.joulis1derful.movieinfo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TV")
public class TV {
    @Column(name = "backdrop_path")
    private String backdropPath;

    @Column(name = "first_air_date")
    private String firstAirDate;

    @Column
    private String genres;

    @Column
    private String homepage;

    @Id
    @Column
    private int id;

    @Column(name = "in_production")
    private boolean inProduction;

    @Column(name = "last_air_date")
    private String lastAirDate;

    @Column
    private String name;

    @Column(name = "number_of_episodes")
    private int numberOfEpisodes;

    @Column(name = "number_of_seasons")
    private int numberOfSeasons;

    @Column(name = "original_language")
    private String originalLanguage;

    @Column(name = "original_name")
    private String originalName;

    @Column
    private String overview;

    @Column
    private double popularity;

    @Column(name = "poster_path")
    private String posterPath;

    @Column
    private String status;

    @Column
    private String type;

    @Column(name = "vote_average")
    private double voteAverage;

    @Column(name = "vote_count")
    private int voteCount;

    public TV(String backdropPath, String firstAirDate, String genres, String homepage, int id, boolean inProduction, String lastAirDate, String name, int numberOfEpisodes, int numberOfSeasons, String originalLanguage, String originalName, String overview, double popularity, String posterPath, String status, String type, double voteAverage, int voteCount) {
        this.backdropPath = backdropPath;
        this.firstAirDate = firstAirDate;
        this.genres = genres;
        this.homepage = homepage;
        this.id = id;
        this.inProduction = inProduction;
        this.lastAirDate = lastAirDate;
        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.numberOfSeasons = numberOfSeasons;
        this.originalLanguage = originalLanguage;
        this.originalName = originalName;
        this.overview = overview;
        this.popularity = popularity;
        this.posterPath = posterPath;
        this.status = status;
        this.type = type;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public String getGenres() {
        return genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getId() {
        return id;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public String getLastAirDate() {
        return lastAirDate;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalName() {
        return originalName;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }
}
