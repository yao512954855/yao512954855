package org.javaboy.test.mapper;

import org.javaboy.test.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmployeeMapper{
    List<Employee> getAllEmployees();
}