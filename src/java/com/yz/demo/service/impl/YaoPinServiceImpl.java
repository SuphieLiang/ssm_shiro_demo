package com.yz.demo.service.impl;

import com.yz.demo.domain.YaoPin;
import com.yz.demo.mapper.YaoPinMapper;
import com.yz.demo.service.YaoPinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("YaoPinService")
public class YaoPinServiceImpl implements YaoPinService{


    @Autowired
    private YaoPinMapper yaoPinMapper;


    @Override
    public List<YaoPin> findAll() {

        return yaoPinMapper.findAll();
    }
}
