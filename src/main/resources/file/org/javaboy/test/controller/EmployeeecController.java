package org.javaboy.test.controller;

import org.javaboy.test.model.Employeeec;
import org.javaboy.test.service.EmployeeecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class EmployeeecController{

    @Autowired
    EmployeeecService employeeecService;

    @GetMapping("/employeeecs")
    public List<Employeeec> getAllEmployeeecs(){
        return employeeecService.getAllEmployeeecs();
    }
}