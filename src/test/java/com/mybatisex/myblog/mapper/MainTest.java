package com.mybatisex.myblog.mapper;

import com.mybatisex.myblog.view.Menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/26
 */
public class MainTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.parse("2018-06-25T17:23:43".replace("T"," "));

        Set<Menu> menus = new HashSet<>();
        List<Menu> list = new ArrayList<>();

        for(int i=0;i<6;i++){
            Menu menu = new Menu();
            menu.setOrder(1);
            menu.setMenuId("sb000");
            list.add(menu);
        }
        System.out.println(list.size());
        menus = new HashSet<>(list);
        System.out.println(menus.size());

        Set set = new HashSet();
        boolean b = set.add(1);
        System.out.println(b);
        boolean c = set.add(1);
        System.out.println(c);

    }
}
