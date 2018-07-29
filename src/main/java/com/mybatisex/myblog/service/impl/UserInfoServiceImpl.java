package com.mybatisex.myblog.service.impl;

import com.mybatisex.myblog.domain.UserInfo;
import com.mybatisex.myblog.mapper.UserInfoMapper;
import com.mybatisex.myblog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/5/19
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> findAll(){
        return userInfoMapper.selectAll();
    }

    public UserInfo add(UserInfo userInfo){
         userInfoMapper.insert(userInfo);
         return  userInfo;
    }

    public void delUser(Integer id){
        userInfoMapper.deleteByPrimaryKey(id);
    }

    public UserInfo update(UserInfo userInfo){
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
        return userInfo;
    }

    public UserInfo updateByExample(UserInfo userInfo){
        Example example = new Example(UserInfo.class);

        example.createCriteria().andLessThan("id",3);

        userInfoMapper.updateByExampleSelective(userInfo,example);
        return userInfo;
    }
    @Cacheable(value = "UserInfo",key = "'user_'.concat(#id.toString())")
    public UserInfo findUserById(Integer id){
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
