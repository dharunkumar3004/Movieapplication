package com.Moviebooking.Moviebooking.Implementation;

import com.Moviebooking.Moviebooking.Models.Requests.Booking;
import com.Moviebooking.Moviebooking.Models.Requests.Theatre;
import com.Moviebooking.Moviebooking.Models.Responses.BookingRepo;
import com.Moviebooking.Moviebooking.Models.Responses.TheatreRepo;
import com.Moviebooking.Moviebooking.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BookingImpl implements BookingService {
   @Autowired
    BookingRepo bookingRepo;
   @Autowired
   TheatreRepo theatreRepo;

    public String bookMovie(Booking booking) {
        Optional<Theatre> theatre = theatreRepo.findById(booking.getShowtime().getTheatre().getId());
        if (theatre.isPresent()) {
            int availableSeats = theatre.get().getTickets();
            if (availableSeats < booking.getNumberOfTickets()) {
                return "Not enough available seats";
            }
            theatre.get().setTickets((int) (availableSeats - booking.getNumberOfTickets()));
            theatreRepo.save(theatre.get());
        } else {
            return "Theatre not found";
        }
        bookingRepo.save(booking);
        return "Booking successful";
    }
}
