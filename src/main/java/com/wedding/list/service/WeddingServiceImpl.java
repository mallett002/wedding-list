package com.wedding.list.service;

import com.wedding.list.model.Rsvp;
import com.wedding.list.repository.WeddingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WeddingServiceImpl implements WeddingService {

    @Autowired
    WeddingRepository weddingRepository;

    @Override
    public Rsvp addRsvp(Rsvp rsvp) {
        return weddingRepository.addRsvp(rsvp);
    }
}
