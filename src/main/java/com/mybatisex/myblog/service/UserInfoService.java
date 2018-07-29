package com.mybatisex.myblog.service;

import com.mybatisex.myblog.domain.UserInfo;

import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/5/19
 */
public interface UserInfoService {
    public List<UserInfo> findAll();
    public UserInfo add(UserInfo userInfo);
    public void delUser(Integer id);
    public UserInfo update(UserInfo userInfo);
    public UserInfo updateByExample(UserInfo userInfo);
    public UserInfo findUserById(Integer id);
}
