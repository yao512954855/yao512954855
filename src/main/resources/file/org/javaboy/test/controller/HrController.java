package org.javaboy.test.controller;

import org.javaboy.test.model.Hr;
import org.javaboy.test.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class HrController{

    @Autowired
    HrService hrService;

    @GetMapping("/hrs")
    public List<Hr> getAllHrs(){
        return hrService.getAllHrs();
    }
}