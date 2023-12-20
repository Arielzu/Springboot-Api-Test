package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class AlcotestService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getAlcotests() {
        String sql = "SELECT * FROM mv_alcotest";
        return jdbcTemplate.queryForList(sql);
    }
}

