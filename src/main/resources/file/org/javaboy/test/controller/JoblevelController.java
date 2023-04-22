package org.javaboy.test.controller;

import org.javaboy.test.model.Joblevel;
import org.javaboy.test.service.JoblevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class JoblevelController{

    @Autowired
    JoblevelService joblevelService;

    @GetMapping("/joblevels")
    public List<Joblevel> getAllJoblevels(){
        return joblevelService.getAllJoblevels();
    }
}