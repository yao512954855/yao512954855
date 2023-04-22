package org.javaboy.test.controller;

import org.javaboy.test.model.Salary;
import org.javaboy.test.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class SalaryController{

    @Autowired
    SalaryService salaryService;

    @GetMapping("/salarys")
    public List<Salary> getAllSalarys(){
        return salaryService.getAllSalarys();
    }
}