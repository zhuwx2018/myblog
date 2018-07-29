package com.mybatisex.myblog.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/7/1
 */
@Component
public class SimpleSender {
    @Autowired
    private AmqpTemplate template;

    public void send(){
        template.convertAndSend(RabbitmqConfig.QUEUE_NAME,"[simple Sender]:hello world");
    }
}
