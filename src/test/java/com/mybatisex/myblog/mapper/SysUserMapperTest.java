package com.mybatisex.myblog.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserMapperTest {
    @Autowired
    private SysuserMapper sysuserMapper;
    @Test
    public void selectTest(){
        sysuserMapper.selectAll();
    }
}
