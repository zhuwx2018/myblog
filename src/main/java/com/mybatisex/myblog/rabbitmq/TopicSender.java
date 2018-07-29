package com.mybatisex.myblog.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/7/6
 */
@Component
public class TopicSender {
    @Autowired
    RabbitTemplate template;

    public void send(){
        System.out.println("send message");
        template.convertAndSend("exchange","topic.message","send message topic.message");
    }

    public void sendMessages(){
        System.out.println("send Messages");
        template.convertAndSend("exchange","topic.#","send messages topic.#");
    }
}
