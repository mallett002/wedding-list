package com.wedding.list.service;

import com.wedding.list.model.Rsvp;
import com.wedding.list.repository.WeddingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeddingServiceImpl implements WeddingService {

    @Autowired
    WeddingRepository weddingRepository;

    @Override
    public void addRsvp(Rsvp rsvp) {
        List<Object[]> guestList = new ArrayList<>();

        for (String guest : rsvp.getGuests()) {
            Object[] guestObj = {guest, rsvp.getToken()};
            guestList.add(guestObj);
        }

        weddingRepository.addRsvp(guestList);
    }
}
