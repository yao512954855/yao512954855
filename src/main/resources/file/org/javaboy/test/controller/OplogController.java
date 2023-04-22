package org.javaboy.test.controller;

import org.javaboy.test.model.Oplog;
import org.javaboy.test.service.OplogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class OplogController{

    @Autowired
    OplogService oplogService;

    @GetMapping("/oplogs")
    public List<Oplog> getAllOplogs(){
        return oplogService.getAllOplogs();
    }
}