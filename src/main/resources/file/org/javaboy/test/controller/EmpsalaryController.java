package org.javaboy.test.controller;

import org.javaboy.test.model.Empsalary;
import org.javaboy.test.service.EmpsalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class EmpsalaryController{

    @Autowired
    EmpsalaryService empsalaryService;

    @GetMapping("/empsalarys")
    public List<Empsalary> getAllEmpsalarys(){
        return empsalaryService.getAllEmpsalarys();
    }
}