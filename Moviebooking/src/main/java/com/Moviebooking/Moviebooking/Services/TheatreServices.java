package com.Moviebooking.Moviebooking.Services;

import com.Moviebooking.Moviebooking.Models.Requests.Theatre;

import java.util.List;

public interface TheatreServices {

    String addTheatre(Theatre theatre);

    List<Theatre> getTheatres();
}
