package com.wedding.list.controllers;

import com.wedding.list.model.Rsvp;
import com.wedding.list.service.WeddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
public class WeddingController {

    @Autowired
    private WeddingService weddingService;

    @RequestMapping(
        value = "/rsvp",
        method = RequestMethod.POST,
        consumes = "application/json"
    )
    public ResponseEntity<Integer> addRsvp(@RequestBody Rsvp rsvp) {
        weddingService.addRsvp(rsvp);
        return ResponseEntity.ok(rsvp.getGuests().size());
    }
}
