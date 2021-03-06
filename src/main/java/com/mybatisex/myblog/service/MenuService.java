package com.mybatisex.myblog.service;

import com.mybatisex.myblog.view.Menu;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/16
 */
public interface MenuService {
    @Cacheable(value = "initMenuAll",key = "#p0",unless = "#result==null")
    public List<Menu> initMenu(String userId);
    public List<Menu> initRootMenu(String userId);
    public List<Menu> initChildren(@NonNull String parentId, String userId);
}
