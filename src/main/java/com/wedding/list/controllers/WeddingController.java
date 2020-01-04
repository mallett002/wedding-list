package com.wedding.list.controllers;

import com.wedding.list.model.Rsvp;
import com.wedding.list.service.WeddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeddingController {

    @Autowired
    private WeddingService weddingService;

    @RequestMapping(
        value = "/rsvp",
        method = RequestMethod.POST,
        consumes = "application/json"
    )
    public ResponseEntity<String> addRsvp(@RequestBody Rsvp rsvp) {
        System.out.println(rsvp);
        weddingService.addRsvp(rsvp);
        return ResponseEntity.ok("yep");
    }
}
