package com.joulis1derful.movieinfo.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joulis1derful.movieinfo.entity.Movie;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ParseMovieInfo {
    private static List<Movie> movies;

    public static Movie getMovieById(int movieId) {
        final String URL_TO_PARSE_DETAILS = "https://api.themoviedb.org/3/movie/"+movieId+"?api_key=52cc54558595d4caee5f1c68a7e7396f";
        Movie movie = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            URL url = new URL(URL_TO_PARSE_DETAILS);
            JsonNode root = mapper.readTree(url);
            boolean adult = root.path("adult").asBoolean();
            String backdropPath = root.path("backdrop_path").asText();
            int budget = root.path("budget").asInt();
            String title = root.path("title").asText();
            JsonNode genresNode = root.path("genres");
            StringBuffer buffer = new StringBuffer();
            for(JsonNode genre : genresNode) {
                JsonNode genreName = genre.path("name");
                buffer.append(genreName.asText() + " ");
            }
            String genres = buffer.toString();
            String homepage = root.path("homepage").asText();
            int id = root.path("id").asInt();
            String imdbId = root.path("imdb_id").asText();
            String originalLanguage = root.path("original_language").asText();
            String originalTitle = root.path("original_title").asText();
            String overview = root.path("overview").asText();
            double popularity = root.path("popularity").asDouble();
            String posterPath = root.path("poster_path").asText();
            String releaseDate = root.path("release_date").asText();
            int revenue = root.path("revenue").asInt();
            int runtime = root.path("runtime").asInt();
            String status = root.path("status").asText();
            String tagline = root.path("tagline").asText();
            boolean video = root.path("video").asBoolean();
            double voteAverage = root.path("vote_average").asDouble();
            int voteCount = root.path("vote_count").asInt();
            movie = new Movie(id, title, adult, backdropPath,
                    budget, genres, homepage, imdbId, originalLanguage, originalTitle,
                    overview, popularity, posterPath, releaseDate, revenue, runtime,
                    status, tagline, video, voteAverage, voteCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movie;
    }

    public static List<Movie> getMovies(String searchName) {
        final String URL_TO_PARSE_MOVIES = "https://api.themoviedb.org/3/search/movie?api_key=52cc54558595d4caee5f1c68a7e7396f&query=" + searchName;
        movies = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        URL url = null;
        try {
            url = new URL(URL_TO_PARSE_MOVIES);
            JsonNode root = mapper.readTree(url);
            JsonNode results = root.path("results");
            for(JsonNode result : results) {
                int id = result.path("id").asInt();
                String title = result.path("title").asText();
                int voteCount = result.path("vote_count").asInt();
                boolean video = result.path("video").asBoolean();
                double voteAverage = result.path("vote_average").asDouble();
                double popularity = result.path("popularity").asDouble();
                String posterPath = result.path("poster_path").asText();
                String originalLanguage = result.path("original_language").asText();
                String originalTitle = result.path("original_title").asText();
                String backdropPath = result.path("backdrop_path").asText();
                boolean adult = result.path("adult").asBoolean();
                String overview = result.path("overview").asText();
                String releaseDate = result.path("release_date").asText();
                Movie movie = new Movie(id, title, adult, backdropPath,
                        originalLanguage, originalTitle, overview, popularity,
                        posterPath, releaseDate, video, voteAverage, voteCount);
                movies.add(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
}
