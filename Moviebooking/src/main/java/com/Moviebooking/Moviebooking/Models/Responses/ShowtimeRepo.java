package com.Moviebooking.Moviebooking.Models.Responses;

import com.Moviebooking.Moviebooking.Models.Requests.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowtimeRepo extends JpaRepository <Showtime,Integer> {
    List<Showtime> findByTheatreId(int theatreId);

    List<Showtime> findByMovieId(int movieId);

}
