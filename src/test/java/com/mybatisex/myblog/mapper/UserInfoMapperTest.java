package com.mybatisex.myblog.mapper;

import com.mybatisex.myblog.domain.UserInfo;
import com.mybatisex.myblog.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/5/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoMapperTest {
    @Autowired
    UserInfoService userInfoService;
    @Test
    public void testCache(){
//        List<UserInfo> userInfos = userInfoService.findAll();
//        for (UserInfo us :userInfos){
//            System.out.println(us.getId());
//        }

        System.out.println(userInfoService.findUserById(1));
    }

}
