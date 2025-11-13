package com.Moviebooking.Moviebooking.Controller;

/*Showtime Management
Map movies to theatres with show timings and ticket price
update and delete
Retrieve all showtimes per movie or theatre*/

import com.Moviebooking.Moviebooking.Models.Requests.Showtime;
import com.Moviebooking.Moviebooking.Services.ShowtimeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    @RequestMapping("/showtimes")
    public class ShowtimeController {
        @Autowired
    ShowtimeServices showtimeServices;

        @PostMapping
        public String addShowtime(@RequestBody Showtime showtime) {
            try {
                return showtimeServices.addShowtime(showtime);
            } catch (Exception e) {
                return "Failed to add showtime";
            }
        }

        @PutMapping("/{id}")
        public String updateShowtime(@PathVariable int id, @RequestBody Showtime updatedShowtime) {
            try {
                return showtimeServices.updateShowtime(id, updatedShowtime);
            } catch (Exception e) {
                return "Failed to update showtime";
            }
        }

        @DeleteMapping("/{id}")
        public String deleteShowtime(@PathVariable int id) {
            try {
                return showtimeServices.deleteShowtime(id);
            } catch (Exception e) {
                return "Failed to delete showtime";
            }
        }


        @GetMapping("/byMovie/{movieId}")
        public List<Showtime> getShowtimesByMovie(@PathVariable int movieId) {
            try {
                return showtimeServices.getShowtimesByMovie(movieId);
            } catch (Exception e) {
                return List.of();
            }
        }

        @GetMapping("/byTheatre/{theatreId}")
        public List<Showtime> getShowtimesByTheatre(@PathVariable int theatreId) {
            try {
                return showtimeServices.getShowtimesByTheatre(theatreId);
            } catch (Exception e) {
                return List.of();
            }
        }
    }

