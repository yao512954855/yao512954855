package org.javaboy.test.mapper;

import org.javaboy.test.model.Employeeremove;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmployeeremoveMapper{
    List<Employeeremove> getAllEmployeeremoves();
}