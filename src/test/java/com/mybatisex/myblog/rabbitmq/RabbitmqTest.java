package com.mybatisex.myblog.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/7/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqTest {
    @Autowired
    private SimpleSender simpleSender;
    @Autowired
    private TopicSender topicSender;
    @Test
    public void sendTest() throws InterruptedException {
        for(int i=0;i<10;i++){
            Thread.sleep(3000);
            simpleSender.send();
        }

    }
    @Test
    public void sendTopic(){
        topicSender.sendMessages();
    }
}
