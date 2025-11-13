package com.Moviebooking.Moviebooking.Models.Responses;

import com.Moviebooking.Moviebooking.Models.Requests.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Integer> {
}
