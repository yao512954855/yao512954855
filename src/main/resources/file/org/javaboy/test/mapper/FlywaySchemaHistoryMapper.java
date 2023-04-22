package org.javaboy.test.mapper;

import org.javaboy.test.model.FlywaySchemaHistory;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface FlywaySchemaHistoryMapper{
    List<FlywaySchemaHistory> getAllFlywaySchemaHistorys();
}