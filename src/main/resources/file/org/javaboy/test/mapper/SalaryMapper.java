package org.javaboy.test.mapper;

import org.javaboy.test.model.Salary;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SalaryMapper{
    List<Salary> getAllSalarys();
}