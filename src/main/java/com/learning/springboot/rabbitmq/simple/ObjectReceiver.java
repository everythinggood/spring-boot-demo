package com.learning.springboot.rabbitmq.simple;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {
    //接收者
    @RabbitHandler
    public void process(User user) {
        System.out.println("Receiver object : " + user.getUserName());
    }
}
