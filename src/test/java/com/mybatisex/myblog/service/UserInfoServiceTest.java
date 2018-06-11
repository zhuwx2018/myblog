package com.mybatisex.myblog.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatisex.myblog.domain.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/5/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoServiceTest {
    @Autowired
    private UserInfoService userInfoService;
    @Test
    public void testFindAll(){
        PageHelper.startPage(2,5);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoService.findAll());

    }
    @Test
    public void addUser(){
        UserInfo user = new UserInfo();
        user.setLastlogin(new Date());
        user.setUserName("可敬亚述");
        user.setUserPw("XXXXXXXXXXXXXXX");
        user.setLastlogin(new Date());
        user.setRegister(new Date());
        System.out.println(userInfoService.add(user));
    }
    @Test
    public void delUserTest(){
        userInfoService.delUser(6);
    }
    @Test
    public void updateUser(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(10);
        userInfo.setUserPw("hello change");
        System.out.println(userInfoService.update(userInfo));
    }
    @Test
    public void updateByExampleTest(){
        UserInfo userInfo = new UserInfo();
        userInfo.setLastlogin(new Date());
        System.out.println(userInfoService.updateByExample(userInfo));
    }
    @Test
    public void bit2small() throws IOException {
        File file = new File("C:\\Users\\zhugf\\Desktop\\helloworld.png");
        File file1 = new File("C:\\Users\\zhugf\\Desktop\\helloworld_1.png");
        BufferedImage image = ImageIO.read(file);
        int h = image.getHeight();
        int w = image.getWidth();
        AffineTransform transform = new AffineTransform();
        double scale = (double) w / h;
        //等比例缩放　
        int nowWidth = 120;
        int nowHeight = (nowWidth * h) / w;
        if (nowHeight > 120) {
            nowHeight = 120;
            nowWidth = (nowHeight * w) / h;
        }

        double sx = (double) nowWidth / w;
        double sy = (double) nowHeight / h;

        transform.setToScale(sx, sy);

        AffineTransformOp ato = new AffineTransformOp(transform, null);
        BufferedImage bid = new BufferedImage(nowWidth, nowHeight,
                BufferedImage.TYPE_3BYTE_BGR);
        ato.filter(image, bid);

        ImageIO.write(bid,"png",file1);
    }
}
