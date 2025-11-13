package com.Moviebooking.Moviebooking.Controller;

import com.Moviebooking.Moviebooking.Models.Requests.Movie;
import com.Moviebooking.Moviebooking.Services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Movie Management Controller
 * - Add a new movie (title, genre, duration)
 * -Update
 * -delete
 * - View all movies
 */

import java.util.List;
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieServices movieServices;

    @PostMapping
    public String addMovie(@RequestBody Movie movie) {
        try {
            return movieServices.addMovie(movie);
        } catch (Exception e) {
            return "Failed to add movie to the list";
        }
    }

    @GetMapping("/view")
    public List<Movie> viewMovies() {
        try {
            return movieServices.viewmovies();
        } catch (Exception e) {
            return List.of();
        }

    }
    @PutMapping("/{id}")
    public String updateMovie(@PathVariable int id, @RequestBody Movie updatedMovie) {
        try {
            return movieServices.updateMovie(id, updatedMovie);
        } catch (Exception e) {
            return "Failed to update movie";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteMovie(@PathVariable int id) {
        try {
            return movieServices.deleteMovie(id);
        } catch (Exception e) {
            return "Failed to delete movie";
        }
    }
}