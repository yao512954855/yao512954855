package org.javaboy.test.mapper;

import org.javaboy.test.model.Empsalary;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmpsalaryMapper{
    List<Empsalary> getAllEmpsalarys();
}