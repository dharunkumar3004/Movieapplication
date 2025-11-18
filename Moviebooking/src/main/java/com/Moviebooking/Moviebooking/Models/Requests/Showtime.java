package com.Moviebooking.Moviebooking.Models.Requests;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/*ShowTime (id, time, price, movie_id, theatre_id)*/
/*Relation(theatre-showtime)*/
@Data
@Entity
public class Showtime {
    @Id
    private int id;
    private Integer showtime_id;
    private long showtime;
    private Integer price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    @JsonManagedReference
    private Movie movie;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theatre_id")
    @JsonManagedReference
    private Theatre theatre;





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
