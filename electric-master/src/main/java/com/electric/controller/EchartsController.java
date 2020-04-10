package com.electric.controller;


import com.electric.domain.Echart;
import com.electric.domain.User;
import com.electric.service.EchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/echart/")
public class EchartsController {
    @Resource
    private EchartsService echartsService;
    HashMap<String, String> map;

    @ResponseBody
    @RequestMapping("countEchart.action")
    public List<Echart> countEchart(HttpSession session, Model model) {

        List list = echartsService.countEchart();
        return list;
    }
}
