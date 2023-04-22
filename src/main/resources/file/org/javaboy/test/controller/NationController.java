package org.javaboy.test.controller;

import org.javaboy.test.model.Nation;
import org.javaboy.test.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class NationController{

    @Autowired
    NationService nationService;

    @GetMapping("/nations")
    public List<Nation> getAllNations(){
        return nationService.getAllNations();
    }
}