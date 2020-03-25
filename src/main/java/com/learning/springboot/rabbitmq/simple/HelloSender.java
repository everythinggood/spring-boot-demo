package com.learning.springboot.rabbitmq.simple;

import lombok.val;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender{

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

    public void sendObject(User user){
        System.out.println("Sender object: " + user.toString());
        this.rabbitTemplate.convertAndSend("object", user);
    }

    public void sendFanoutMessage(User user){
        System.out.println("Sender object: " + user.toString());
        rabbitTemplate.convertAndSend("fanoutExchange1",null,user);
    }

    public void sendFanoutMessage2(User user){
        System.out.println("Sender object: " + user.toString());
        rabbitTemplate.convertAndSend("userTest-exchange","userTest-key",user);
    }
}
