package org.javaboy.test.mapper;

import org.javaboy.test.model.Department;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface DepartmentMapper{
    List<Department> getAllDepartments();
}