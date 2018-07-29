package com.mybatisex.myblog.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/7/1
 */
@Component
@RabbitListener(queues = {RabbitmqConfig.QUEUE_NAME})
public class SimpleReceiver {
    @RabbitHandler
    public void process(String msg){
        System.out.println("[接收者一]:"+msg);
    }

}
