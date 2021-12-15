package com.shao.springboot.demo.service;
import com.shao.springboot.demo.mapper.Testmapper;
import org.springframework.stereotype.Service;
import com.shao.springboot.demo.domain.Test;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource//jdk自带的
    private Testmapper testmapper;
    public List<Test> list(){
        return testmapper.list();
    }
}
