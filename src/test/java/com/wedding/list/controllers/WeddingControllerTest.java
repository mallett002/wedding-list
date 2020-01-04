package com.wedding.list.controllers;

import com.wedding.list.model.Rsvp;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class WeddingControllerTest {

    @Test
    public void testAddGuest() {
        RestTemplate restTemplate = new RestTemplate();

        Rsvp rsvp = new Rsvp();
        rsvp.setToken("test_token");
        List<String> guests = new ArrayList<>();
        guests.add("Will");
        guests.add("Marcela");
        guests.add("Brad");
        rsvp.setGuests(guests);

        restTemplate.postForObject(
                "http://localhost:8080/rsvp",
                rsvp,
                ResponseEntity.class
        );
    }
}
