package com.Moviebooking.Moviebooking.Controller;

/*Theatre Management
Add theatres with location and name
View all theatres*/

import com.Moviebooking.Moviebooking.Models.Requests.Movie;
import com.Moviebooking.Moviebooking.Models.Requests.Theatre;
import com.Moviebooking.Moviebooking.Services.MovieServices;
import com.Moviebooking.Moviebooking.Services.TheatreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/theatres")
public class TheatreController {
    @Autowired
    TheatreServices theatreServices;
    @PostMapping
        public String addTheatre(@RequestBody Theatre theatre) {
            try {
                return theatreServices.addTheatre(theatre);
            } catch (Exception e) {
                return "Failed to add movie to the list";
            }
        }
        @GetMapping("/getTheatres")
    public List <Theatre> getTheatres(){
        try{
            return theatreServices.getTheatres();
        }catch(Exception e){
            return List.of();

        }
    }
}
