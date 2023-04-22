package org.javaboy.test.service;

import org.javaboy.test.model.HrRole;
import org.javaboy.test.mapper.HrRoleMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class HrRoleService{

    @Autowired
    HrRoleMapper hrRoleMapper;
    public List<HrRole> getAllHrRoles(){
        return hrRoleMapper.getAllHrRoles();
    }
}