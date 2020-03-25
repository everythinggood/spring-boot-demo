package com.learning.springboot.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig2 {
    @Bean
    public Queue queue1(){
        return new Queue("queue1");
    }

    @Bean
    public Queue autoDeteleQueue(){
        return new AnonymousQueue();
    }
    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange1");
    }
    @Bean
    public Binding queue1Binding(){
        return BindingBuilder.bind(autoDeteleQueue()).to(fanoutExchange());
    }
}
