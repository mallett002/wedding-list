package com.wedding.list.repository;

import com.wedding.list.model.Rsvp;

import java.util.List;

public interface WeddingRepository {

    void addRsvp(List<Object[]> guestList);

    Rsvp getRsvp(Integer id);
}
