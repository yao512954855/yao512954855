package org.javaboy.test.controller;

import org.javaboy.test.model.FlywaySchemaHistory;
import org.javaboy.test.service.FlywaySchemaHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class FlywaySchemaHistoryController{

    @Autowired
    FlywaySchemaHistoryService flywaySchemaHistoryService;

    @GetMapping("/flywayschemahistorys")
    public List<FlywaySchemaHistory> getAllFlywaySchemaHistorys(){
        return flywaySchemaHistoryService.getAllFlywaySchemaHistorys();
    }
}