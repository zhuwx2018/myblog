package com.mybatisex.myblog.service.impl;

import com.mybatisex.myblog.domain.Sysfunction;
import com.mybatisex.myblog.mapper.SysfunctionMapper;
import com.mybatisex.myblog.service.MenuService;
import com.mybatisex.myblog.view.Menu;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.ListUtils;
import org.thymeleaf.util.SetUtils;

import java.util.*;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/16
 */
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private SysfunctionMapper sysfunctionMapper;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    public List<Menu> initMenu(String  userId){
        List<Menu> rootMenus = initRootMenu(userId);
        if (!ListUtils.isEmpty(rootMenus)){
            for(Menu rootMenu:rootMenus){
                rootMenu.setChildren(initChildren(rootMenu.getMenuId(),userId));
            }
        }
        return new ArrayList<>(rootMenus);
    }

    public List<Menu> initRootMenu(String userId){
        Set<Menu> set = new HashSet<>();
        Set<Sysfunction> sysfunctions = null;
        // 超级管理员处理不进行权限过滤
        if (userId.equals("admin")){
            sysfunctions = new HashSet<>(sysfunctionMapper.findRootMenu(userId));
        }else {
            sysfunctions = sysfunctionMapper.selectRootMenu(userId);
        }
        for (Sysfunction sysfunction : sysfunctions){
            Menu menu = new Menu();
            BeanUtils.copyProperties(sysfunction,menu);
            menu.setMenuId(sysfunction.getFunctionid());
            menu.setOrder(sysfunction.getOrderno()==null?-1:sysfunction.getOrderno());
            set.add(menu);
        }
        List<Menu> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
    @Cacheable(value = "userIdAndParentId",key = "#parentId.concat(#userId)",unless = "#result==null")
    public List<Menu> initChildren(String parentId,String userId){
        
        Map<String,Object> params = new HashMap<>();
        params.put("menuId",parentId);
        params.put("userId",userId);
        Set<Menu> set = sysfunctionMapper.findByParent(params);
        List<Menu> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }





}
