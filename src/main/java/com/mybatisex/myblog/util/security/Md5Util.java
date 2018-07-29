package com.mybatisex.myblog.util.security;

import org.springframework.util.DigestUtils;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/7/11
 */
public class Md5Util {
    /**
     * MD5方法
     * @param text 明文
     * @param salt 盐
     * @return 密文
     * @throws Exception
     */
    public static String md5BySalt(String text, String salt) throws Exception {
        //加密后的字符串
        return DigestUtils.md5DigestAsHex((text+salt).getBytes());
    }

    /**
     * MD5验证方法
     *
     * @param text 明文
     * @param key 密钥
     * @param md5 密文
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String text, String key, String md5) throws Exception {
        //根据传入的密钥进行验证
        String md5Text = md5BySalt(text, key);
        if(md5Text.equalsIgnoreCase(md5))return true;
        return false;
    }

    /**
     * Md5 加密
     * @param text
     * @return
     */
    public static String md5(String text) throws Exception {
        return Md5Util.md5BySalt(text,"");
    }
}
