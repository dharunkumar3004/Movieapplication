package com.Moviebooking.Moviebooking.Models.Requests;

/*Theatre (id, name, location)*/

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Theatre {
    @Id
    private Integer theatre_id;
    private String theatre_name;
    private Character location;
    @OneToMany(mappedBy = "theatre")
    @JsonManagedReference

    List<Showtime> showtimes;


    public void setTheatre_id(int theatre_id) {
        this.theatre_id = theatre_id;
    }

    public void setTheatre_name(String theatre_name) {
        this.theatre_name = theatre_name;
    }

    public void setLocation(Character location) {
        this.location = location;
    }

    public int getTheatre_id() {
        return theatre_id;
    }
    public String getTheatre_name(){
        return theatre_name;
    }

    public Character getLocation() {
        return location;
    }
}
