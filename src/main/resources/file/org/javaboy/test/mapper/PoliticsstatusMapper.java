package org.javaboy.test.mapper;

import org.javaboy.test.model.Politicsstatus;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PoliticsstatusMapper{
    List<Politicsstatus> getAllPoliticsstatuss();
}