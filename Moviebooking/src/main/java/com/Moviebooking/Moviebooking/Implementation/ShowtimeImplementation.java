package com.Moviebooking.Moviebooking.Implementation;

import com.Moviebooking.Moviebooking.Models.Requests.Movie;
import com.Moviebooking.Moviebooking.Models.Requests.Showtime;
import com.Moviebooking.Moviebooking.Models.Responses.ShowtimeRepo;
import com.Moviebooking.Moviebooking.Services.ShowtimeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
    public class ShowtimeImplementation implements ShowtimeServices {
        public static List<Showtime> showtimes = new ArrayList<>();
        @Autowired
        ShowtimeRepo showtimeRepo;

        @Override
        public String addShowtime(Showtime showtime) {
            showtime.setshowtime(System.currentTimeMillis());
            System.out.println(System.currentTimeMillis());
            showtimeRepo.save(showtime);
            return "Showtime has been added successfully";
        }
    @Override
    public String updateShowtime(int id, Showtime updatedShowtime) {
        Optional<Showtime> showtime = showtimeRepo.findById(id);
        if (showtime.isPresent()) {
            showtime.get().setShowtime_id(updatedShowtime.getShowtime_id());
            showtime.get().setshowtime(updatedShowtime.getshowtime());
            showtime.get().setPrice(updatedShowtime.getPrice());
            showtimeRepo.save(showtime.get());
            return "Movie updated successfully";
        }
        return "Movie not found";
    }

    @Override
    public String deleteShowtime(int id) {
        Optional<Showtime> showtime = showtimeRepo.findById(id);
        if (showtime.isPresent()) {
            showtimeRepo.deleteById(id);
            return "Movie deleted successfully";
        }
        return "Movie not found";
    }
        @Override
        public List<Showtime> getShowtimesByMovie(int movieId) {
            return showtimeRepo.findByMovieId(movieId);
        }

        @Override
        public List<Showtime> getShowtimesByTheatre(int theatreId) {
            return showtimeRepo.findByTheatreId(theatreId);
        }
}


