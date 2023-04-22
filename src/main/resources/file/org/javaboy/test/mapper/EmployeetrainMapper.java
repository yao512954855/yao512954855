package org.javaboy.test.mapper;

import org.javaboy.test.model.Employeetrain;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmployeetrainMapper{
    List<Employeetrain> getAllEmployeetrains();
}