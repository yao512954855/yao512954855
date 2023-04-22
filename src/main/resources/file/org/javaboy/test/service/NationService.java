package org.javaboy.test.service;

import org.javaboy.test.model.Nation;
import org.javaboy.test.mapper.NationMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class NationService{

    @Autowired
    NationMapper nationMapper;
    public List<Nation> getAllNations(){
        return nationMapper.getAllNations();
    }
}