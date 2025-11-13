package com.Moviebooking.Moviebooking.Implementation;

import com.Moviebooking.Moviebooking.Models.Requests.Theatre;
import com.Moviebooking.Moviebooking.Models.Responses.TheatreRepo;
import com.Moviebooking.Moviebooking.Services.TheatreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

    @Service
    public class TheatreImplementation implements TheatreServices{
        public static List <Theatre> theatres = new ArrayList<>();
        @Autowired
        TheatreRepo theatreRepo;

        @Override
        public String addTheatre(Theatre theatre) {
            theatreRepo.save(theatre);
            return "Theatre details has been added successfully";
        }
        public List<Theatre> getTheatres(){
            return theatreRepo.findAll();
        }

    }
