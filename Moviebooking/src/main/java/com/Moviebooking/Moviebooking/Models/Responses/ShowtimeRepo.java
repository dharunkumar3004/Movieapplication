package com.Moviebooking.Moviebooking.Models.Responses;

import com.Moviebooking.Moviebooking.Models.Requests.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowtimeRepo extends JpaRepository <Showtime,Integer> {
    List<Showtime> findByTheatreId(int theatreId);

    List<Showtime> findByMovieId(int movieId);
}
