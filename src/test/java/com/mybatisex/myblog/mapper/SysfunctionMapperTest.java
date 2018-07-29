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

import java.util.*;

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
        Set<Sysfunction> list = new HashSet<>(sysfunctionMapper.selectAll());
        Set<Menu> menus = new HashSet<>();
        for(Sysfunction sysfunction:list){
            Menu menu = new Menu();
            BeanUtils.copyProperties(sysfunction,menu);
            menu.setOrder(sysfunction.getOrderno());
            String menuID = sysfunction.getFunctionid();
            menu.setMenuId(menuID);
            Map<String,Object> params = new HashMap<>();
            params.put("userId","admin");
            params.put("menuId",menuID);
            menu.setChildren(new ArrayList<Menu>(sysfunctionMapper.findByParent(params)));
            menus.add(menu);
        }
        List<Menu> listss = new ArrayList<>(menus);
        Collections.sort(listss);
        String jsonStr = JSONObject.toJSONString(listss);
        System.out.println(jsonStr);
    }
    @Test
    public void testSet(){
        Map<String,Object> map = new HashMap<>();
//        map.put("menuId","");
//        Set<Menu> menus = sysfunctionMapper.selectByParent(map);
        Set<Menu> menus = sysfunctionMapper.findByParent(map);
        System.out.println(menus.size());
    }
}
