package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;


@Component
public class DatabaseTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void testConnection() {
        String sql = "SELECT * FROM mv_alcotest WHERE alcempcod = 1 "; // reemplaza 'tu_tabla' con el nombre de una tabla en tu base de datos
        List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> result : results) {
            System.out.println(result);
        }
    }
}
