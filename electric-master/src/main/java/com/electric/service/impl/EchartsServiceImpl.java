package com.electric.service.impl;

import com.electric.domain.Echart;
import com.electric.mapper.EchartsMapper;
import com.electric.service.EchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@Transactional
public class EchartsServiceImpl implements EchartsService {
    @Autowired
    private EchartsMapper echartsMapper;
    public List<Echart> countEchart() {
        return echartsMapper.countEChart();
    }
}
