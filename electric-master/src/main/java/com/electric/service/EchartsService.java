package com.electric.service;

import com.electric.domain.Echart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EchartsService {
    List<Echart> countEchart();
}
