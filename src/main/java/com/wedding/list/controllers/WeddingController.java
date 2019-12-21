package com.wedding.list.controllers;

import com.wedding.list.model.Rsvp;
import com.wedding.list.service.WeddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeddingController {

    @Autowired
    private WeddingService weddingService;

    @RequestMapping(value = "/rsvp", method = RequestMethod.POST)
    public @ResponseBody
    Rsvp addRsvp(@RequestBody Rsvp rsvp) {
        return weddingService.addRsvp(rsvp);
    }
}
