package com.wedding.list.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class JdbcInsert {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    SimpleJdbcInsert insert;

    public JdbcInsert() {
        this.insert = new SimpleJdbcInsert(jdbcTemplate);
    }

    public SimpleJdbcInsert getInsert() {
        return this.insert;
    }
}
