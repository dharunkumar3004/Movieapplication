package com.Moviebooking.Moviebooking.Models.Requests;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/*ShowTime (id, time, price, movie_id, theatre_id)*/
/*Relation(theatre-showtime)*/
@Data
@Entity
public class Showtime {
    @Id
    private Integer showtime_id;
    private long showtime;
    private Integer price;


    public void setShowtime_id(int showtime_id) {
        this.showtime_id = showtime_id;
    }

    public void setshowtime(long showtime) {
        this.showtime = showtime;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShowtime_id() {
        return showtime_id;
    }

    public long getshowtime() {
        return showtime;
    }

    public int getPrice() {
        return price;
    }

}
