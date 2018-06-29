package com.mybatisex.myblog.service.impl;

import com.mybatisex.myblog.domain.Sysfunction;
import com.mybatisex.myblog.mapper.SysfunctionMapper;
import com.mybatisex.myblog.service.MenuService;
import com.mybatisex.myblog.view.Menu;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.ListUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/16
 */
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private SysfunctionMapper sysfunctionMapper;

    public List<Menu> initMenu(String  userId){
        List<Menu> rootMenus = initRootMenu(userId);
        if (!ListUtils.isEmpty(rootMenus)){
            for(Menu rootMenu:rootMenus){
                rootMenu.setChildren(initChildren(rootMenu.getMenuId(),userId));
            }
        }
        return rootMenus;
    }

    public List<Menu> initRootMenu(String userId){
        List<Menu> list = new ArrayList<>();
        List<Sysfunction> sysfunctions = sysfunctionMapper.selectRootMenu(userId);
        for (Sysfunction sysfunction : sysfunctions){
            Menu menu = new Menu();
            BeanUtils.copyProperties(sysfunction,menu);
            menu.setMenuId(sysfunction.getFunctionid());
            menu.setOrder(sysfunction.getOrderno());
            list.add(menu);
        }
        return list;
    }

    public List<Menu> initChildren(String parentId,String userId){
        Map<String,Object> params = new HashMap<>();
        params.put("menuId",parentId);
        params.put("userId",userId);
        return sysfunctionMapper.findByParent(params);
    }

}
