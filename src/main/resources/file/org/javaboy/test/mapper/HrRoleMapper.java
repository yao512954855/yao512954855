package org.javaboy.test.mapper;

import org.javaboy.test.model.HrRole;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface HrRoleMapper{
    List<HrRole> getAllHrRoles();
}