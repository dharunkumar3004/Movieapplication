package com.Moviebooking.Moviebooking.Controller;

/*Allow a user to book tickets for a specific showtime
Capture user name and number of tickets
Display all bookings*/

import com.Moviebooking.Moviebooking.Models.Requests.Booking;
import com.Moviebooking.Moviebooking.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookingController {
    @Autowired
    BookingService bookingService;
    @PostMapping
    public String bookTickets(@RequestBody Booking booking) {
        try{
            return bookingService.bookMovie(booking);
        }catch (Exception e){
            return "Failed to book tickets";
        }
    }



}
