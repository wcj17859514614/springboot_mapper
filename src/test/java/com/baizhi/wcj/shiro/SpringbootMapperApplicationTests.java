package com.baizhi.wcj.shiro;

import com.baizhi.wcj.shiro.dao.EmsMapper;
import com.baizhi.wcj.shiro.entity.Ems;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMapperApplicationTests {

    @Resource
    private EmsMapper emsMapper;

    @Test
    public void contextLoads() {
        List<Ems> ems = emsMapper.selectAll();
        for (Ems em : ems) {
            System.out.println(em);
        }
    }

    @Test
    public void contextInsert() {
        emsMapper.insert(new Ems(15,"www",11111.00,25));
    }

    @Test
    public void contextUpdate() {
        emsMapper.updateByPrimaryKey(new Ems(15,"mmm",19500.00,25));
    }
}
