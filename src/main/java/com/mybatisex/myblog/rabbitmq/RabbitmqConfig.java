package com.mybatisex.myblog.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/7/1
 */
@Configuration
public class RabbitmqConfig {
    public static final String QUEUE_NAME = "test_queue_one";
    @Bean
    public Queue queue(){
        return new Queue(RabbitmqConfig.QUEUE_NAME);
    }

}
