package com.wedding.list.model;

import java.util.List;

public class Rsvp {

    private Integer id;
    private boolean attending;
    private List<String> guests;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getGuests() {
        return guests;
    }

    public boolean isAttending() {
        return attending;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGuests(List<String> guests) {
        // RequestBody.attending will be an array
        this.guests = guests;
    }

    public void setAttending(boolean attending) {
        this.attending = attending;
    }
}
