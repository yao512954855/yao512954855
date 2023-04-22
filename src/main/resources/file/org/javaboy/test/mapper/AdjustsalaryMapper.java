package org.javaboy.test.mapper;

import org.javaboy.test.model.Adjustsalary;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AdjustsalaryMapper{
    List<Adjustsalary> getAllAdjustsalarys();
}