package com.yz.demo.mapper;

import com.yz.demo.domain.YaoPin;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface YaoPinMapper {
    public List<YaoPin> findAll();
}
