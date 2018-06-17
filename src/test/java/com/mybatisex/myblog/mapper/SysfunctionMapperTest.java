package com.mybatisex.myblog.mapper;

import com.alibaba.fastjson.JSONObject;
import com.mybatisex.myblog.domain.Sysfunction;
import com.mybatisex.myblog.view.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysfunctionMapperTest {
    @Autowired
    SysfunctionMapper sysfunctionMapper;
    @Test
    public void findAll(){
        List<Sysfunction> list = sysfunctionMapper.selectRootMenu();
        List<Menu> menus = new ArrayList<>();
        for(Sysfunction sysfunction:list){
            Menu menu = new Menu();
            BeanUtils.copyProperties(sysfunction,menu);
            menu.setOrder(sysfunction.getOrderno());
            String menuID = sysfunction.getFunctionid();
            menu.setMenuId(menuID);
            Map<String,Object> params = new HashMap<>();
            params.put("userId","szadmin");
            params.put("menuId",menuID);
            menu.setChildren(sysfunctionMapper.findByParent(params));
            menus.add(menu);
        }
        String jsonStr = JSONObject.toJSONString(menus);
        System.out.println(jsonStr);
    }
}
