package com.wedding.list.repository;

import com.wedding.list.model.Rsvp;

public interface WeddingRepository {

    Rsvp addRsvp(Rsvp rsvp);

    Rsvp getRsvp(Integer id);
}
