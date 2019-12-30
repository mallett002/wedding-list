package com.wedding.list.model;

import java.util.List;

public class Rsvp {

    private String token;
    private List<String> guests;

    public List<String> getGuests() {
        return guests;
    }

    public String getToken() { return token; }

    public void setGuests(List<String> guests) { this.guests = guests; }

    public void setToken(String token) { this.token = token; }

}
