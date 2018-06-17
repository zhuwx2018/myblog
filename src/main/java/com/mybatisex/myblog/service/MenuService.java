package com.mybatisex.myblog.service;

import com.mybatisex.myblog.view.Menu;

import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/16
 */
public interface MenuService {
    public List<Menu> initMenu();
    public List<Menu> initRootMenu();
    public List<Menu> initChildren(String parentId, String userId);
}
