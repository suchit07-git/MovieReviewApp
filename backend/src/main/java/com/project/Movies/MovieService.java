package com.project.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;
    public List<Movie> allMovies() {
        return repository.findAll();
    }

    public Optional<Movie> getSingleMovie(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}
