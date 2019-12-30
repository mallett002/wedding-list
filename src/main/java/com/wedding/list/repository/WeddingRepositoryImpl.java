package com.wedding.list.repository;

import com.wedding.list.model.Rsvp;
import com.wedding.list.repository.util.RsvpRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WeddingRepositoryImpl implements WeddingRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addRsvp(List<Object[]> guestList) {
        String SQL = "INSERT INTO guests (name, group_token) values (?, ?)";
        jdbcTemplate.batchUpdate(SQL, guestList);
    }

    @Override
    public Rsvp getRsvp(Integer id) {
        Rsvp rsvp = jdbcTemplate.queryForObject(
                "SELECT * FROM rsvp_list WHERE id = ?",
                new RsvpRowMapper(),
                id
        );

        return rsvp;
    }
}
