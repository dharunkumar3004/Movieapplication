package com.Moviebooking.Moviebooking.Models.Requests;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*Movie (id, title, genre, duration)*/

@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movie_id;
    private long movie_time;
    private String genre;
    private int duration;
    @OneToMany(mappedBy = "movie")
    @JsonManagedReference
    List<Showtime> showtimes = new ArrayList<>();
    public void Movie(String name,String genre){

    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public void setMovie_time(long movie_time) {
        this.movie_time = movie_time;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public long getMovie_time() {
        return movie_time;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
}
