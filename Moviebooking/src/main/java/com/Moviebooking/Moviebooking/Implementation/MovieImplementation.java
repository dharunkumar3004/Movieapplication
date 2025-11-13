package com.Moviebooking.Moviebooking.Implementation;

import com.Moviebooking.Moviebooking.Models.Requests.Movie;
import com.Moviebooking.Moviebooking.Models.Responses.MovieRepo;
import com.Moviebooking.Moviebooking.Services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieImplementation implements MovieServices {
    @Autowired
    MovieRepo movieRepo;

    @Override
    public String addMovie(Movie movies) {
        movies.setMovie_time(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        movieRepo.save(movies);
        return "Movie details has been added successfully";
    }
    public List<Movie> viewmovies() {
        return movieRepo.findAll();
    }
 @Override
 public String updateMovie(int id, Movie updatedMovie) {
     Optional<Movie> movie = movieRepo.findById(id);
     if (movie.isPresent()) {
         movie.get().setMovie_time(updatedMovie.getMovie_time());
         movie.get().setGenre(updatedMovie.getGenre());
         movie.get().setDuration(updatedMovie.getDuration());
         movieRepo.save(movie.get());
         return "Movie updated successfully";
     }
     return "Movie not found";
 }

    @Override
    public String deleteMovie(int id) {
        Optional<Movie> movie = movieRepo.findById(id);
        if (movie.isPresent()) {
            movieRepo.deleteById(id);
            return "Movie deleted successfully";
        }
        return "Movie not found";
    }

}
