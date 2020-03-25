package com.learning.springboot.rabbitmq.simple;

import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(queues = "queue1")
    @RabbitHandler
    public void listerQueue1(User user) {
        System.out.println("Receiver object : " + user.getUserName());
    }

    @RabbitListener(queues = "#{autoDeteleQueue.name}")
    @RabbitHandler
    public void listerQueue3(User user) {
        System.out.println("Receiver object : " + user.getUserName());
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "userTest-queue", durable = "true"),
            exchange = @Exchange(name = "userTest-exchange", durable = "true", type = "direct"),
            key = "userTest-key"
    )
    )
    @RabbitHandler
    public void listerQueue2(User user) {
        System.out.println("Receiver object : " + user.getUserName());
    }
}
