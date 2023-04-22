package org.javaboy.test.mapper;

import org.javaboy.test.model.Employeeec;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmployeeecMapper{
    List<Employeeec> getAllEmployeeecs();
}