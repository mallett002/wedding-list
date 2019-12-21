package com.wedding.list.repository.util;

import java.sql.ResultSet;
import java.sql.Array;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.wedding.list.model.Rsvp;
import org.springframework.jdbc.core.RowMapper;

public class RsvpRowMapper implements RowMapper<Rsvp> {

    @Override
    public Rsvp mapRow(ResultSet rs, int rowNum) throws SQLException {
        Rsvp rsvp = new Rsvp();
        rsvp.setId(rs.getInt("id"));
        rsvp.setName(rs.getString("name"));
        rsvp.setGuests(getList(rs.getArray("guests")));
        rsvp.setAttending(rs.getBoolean("attending"));
        return rsvp;
    }

    List<String> getList(Array guestsArray) throws SQLException {
        return Stream.of((String[]) guestsArray.getArray())
                .collect(Collectors.toList());
    }
}
