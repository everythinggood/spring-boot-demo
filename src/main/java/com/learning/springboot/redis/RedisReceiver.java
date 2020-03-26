package com.learning.springboot.redis;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RedisReceiver implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] bytes) {
        System.out.println("redis receive:");
        System.out.println(new String(message.getBody()));
        System.out.println(new String(message.getChannel()));
    }
}
