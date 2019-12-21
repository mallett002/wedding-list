package com.wedding.list.repository.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.wedding.list.model.Rsvp;
import org.springframework.jdbc.core.RowMapper;

public class RsvpRowMapper implements RowMapper<Rsvp> {
    @Override
    public Rsvp mapRow(ResultSet rs, int rowNum) throws SQLException {
        Rsvp rsvp = new Rsvp();
        rsvp.setId(rs.getInt("id"));
        rsvp.setName(rs.getString("name"));
        rsvp.setGuests(rs.getArray("guests")); //Todo: fix this
        rsvp.setAttending(rs.getBoolean("attending"));
        return rsvp;
    }
}
