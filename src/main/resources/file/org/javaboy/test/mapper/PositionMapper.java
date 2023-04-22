package org.javaboy.test.mapper;

import org.javaboy.test.model.Position;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PositionMapper{
    List<Position> getAllPositions();
}