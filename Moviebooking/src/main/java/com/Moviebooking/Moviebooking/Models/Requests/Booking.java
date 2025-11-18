package com.Moviebooking.Moviebooking.Models.Requests;

//Booking (id, customerName, numberOfTickets, showTime_id)
/*Relations (Movie - Booking - showtime)*/

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Booking {
    @Id
    private int id;
    private String customer_name;
    private long numberOfTickets;
    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private Showtime showtime;
    private int tickets;


    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setNumberOfTickets(long numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }




    public String getCustomer_name() {
        return customer_name;
    }

    public long getNumberOfTickets() {
        return numberOfTickets;
    }

}
