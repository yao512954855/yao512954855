package org.javaboy.test.controller;

import org.javaboy.test.model.Politicsstatus;
import org.javaboy.test.service.PoliticsstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class PoliticsstatusController{

    @Autowired
    PoliticsstatusService politicsstatusService;

    @GetMapping("/politicsstatuss")
    public List<Politicsstatus> getAllPoliticsstatuss(){
        return politicsstatusService.getAllPoliticsstatuss();
    }
}