package com.mybatisex.myblog.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/26
 */
public class MainTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.parse("2018-06-25T17:23:43".replace("T"," "));
    }
}
