package com.example.controller;
import com.example.service.AlcotestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AlcotestController {

    private final AlcotestService alcotestService;

    @Autowired
    public AlcotestController(AlcotestService alcotestService) {
        this.alcotestService = alcotestService;
    }

    @GetMapping("/alcotests")
    public List<Map<String, Object>> getAlcotests() {
        return alcotestService.getAlcotests();
    }
}
