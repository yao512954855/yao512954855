package org.javaboy.test.controller;

import org.javaboy.test.model.Department;
import org.javaboy.test.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class DepartmentController{

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}