package com.Moviebooking.Moviebooking.Models.Responses;

import com.Moviebooking.Moviebooking.Models.Requests.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
}
