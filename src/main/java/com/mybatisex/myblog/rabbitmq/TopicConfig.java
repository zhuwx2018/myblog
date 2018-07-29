package com.mybatisex.myblog.rabbitmq;


import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/7/6
 */
@Configuration
public class TopicConfig {

    private final static String MESSAGE = "topic.message";
    private final static String MESSAGES = "topic.messages";
    @Bean
    public Queue queueMessage(){
        return new Queue(MESSAGE);
    }
    @Bean
    public Queue queueMessages(){
        return new Queue(MESSAGES);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("exchange");
    }
    @Bean
    BindingBuilder.GenericArgumentsConfigurer bindingExchangeMessage(Queue queueMessage, Exchange exchange){
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }
    @Bean
    BindingBuilder.GenericArgumentsConfigurer bindingExchangeMessages(Queue queueMessages, Exchange exchange){
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}
