package com.wedding.list.repository;

import com.wedding.list.model.Rsvp;
import com.wedding.list.repository.util.RsvpRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeddingRepositoryImpl implements WeddingRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Rsvp addRsvp(Rsvp rsvp) {
        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);

        List<String> columns = new ArrayList<>();
        columns.add("name");
        columns.add("attending");
        columns.add("guests"); // people that person is bringing as a guest

        insert.setTableName("rsvp_list");
        insert.setColumnNames(columns);

        Map<String, Object> data = new HashMap<>();
        data.put("attending", rsvp.isAttending());
        data.put("guests", rsvp.getGuests());
        data.put("name", rsvp.getName());

        insert.setGeneratedKeyName("id");
        Number id = insert.executeAndReturnKey(data);

        return getRsvp(id.intValue());
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
