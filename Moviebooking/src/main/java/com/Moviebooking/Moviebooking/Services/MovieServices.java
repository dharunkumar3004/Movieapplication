package com.Moviebooking.Moviebooking.Services;

import com.Moviebooking.Moviebooking.Models.Requests.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MovieServices {
    String addMovie(Movie movie);
    List<Movie> viewmovies();

    String updateMovie(int id, Movie updatedMovie);

    String deleteMovie(int id);
}
