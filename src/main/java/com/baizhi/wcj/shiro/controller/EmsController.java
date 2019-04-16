package com.baizhi.wcj.shiro.controller;

import com.baizhi.wcj.shiro.dao.EmsMapper;
import com.baizhi.wcj.shiro.entity.Ems;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("ems")
public class EmsController {

    @Resource
    private EmsMapper emsMapper;

    @RequestMapping("showAll")
    public void TestEms(){
        List<Ems> ems = emsMapper.selectAll();
        for (Ems em : ems) {
            System.out.println(em);
        }
    }
}
