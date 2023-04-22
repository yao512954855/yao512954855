package org.javaboy.test.controller;

import org.javaboy.test.model.HrRole;
import org.javaboy.test.service.HrRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class HrRoleController{

    @Autowired
    HrRoleService hrRoleService;

    @GetMapping("/hrroles")
    public List<HrRole> getAllHrRoles(){
        return hrRoleService.getAllHrRoles();
    }
}