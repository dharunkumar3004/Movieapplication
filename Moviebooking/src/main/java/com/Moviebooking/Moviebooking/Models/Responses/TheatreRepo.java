package com.Moviebooking.Moviebooking.Models.Responses;

import com.Moviebooking.Moviebooking.Models.Requests.Movie;
import com.Moviebooking.Moviebooking.Models.Requests.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepo extends JpaRepository<Theatre,Integer> {
}
