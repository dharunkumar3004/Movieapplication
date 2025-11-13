package com.Moviebooking.Moviebooking.Models.Requests;

//Booking (id, customerName, numberOfTickets, showTime_id)
/*Relations (Movie - Booking - showtime)*/

public class Booking {
    private int booking_id;
    private String customer_name;
    private long numberOfTickets;

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setNumberOfTickets(long numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }


    public int getBooking_id() {
        return booking_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public long getNumberOfTickets() {
        return numberOfTickets;
    }

}
