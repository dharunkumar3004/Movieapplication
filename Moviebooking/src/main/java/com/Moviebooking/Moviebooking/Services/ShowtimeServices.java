package com.Moviebooking.Moviebooking.Services;

import com.Moviebooking.Moviebooking.Models.Requests.Showtime;

import java.util.List;

public interface ShowtimeServices {
    String addShowtime(Showtime showtime);
    List<Showtime> getShowtimesByMovie(int movieId);
    List<Showtime> getShowtimesByTheatre(int theatreId);

    String updateShowtime(int id, Showtime updatedShowtime);

    String deleteShowtime(int id);
}
