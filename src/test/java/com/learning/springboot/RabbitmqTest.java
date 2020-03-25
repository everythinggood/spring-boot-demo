package com.learning.springboot;

import com.learning.springboot.rabbitmq.simple.HelloSender;
import com.learning.springboot.rabbitmq.simple.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqTest {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        for(int i=0;i<10;i++){
            helloSender.send();
        }
    }

    @Test
    public void object() throws Exception{
        for (int i=0;i<10;i++){
            helloSender.sendObject(new User(String.valueOf(i),String.valueOf(i)));
        }
    }

    @Test
    public void fanout() throws Exception{
        for (int i=0;i<10;i++){
            helloSender.sendFanoutMessage(new User(String.valueOf(i),String.valueOf(i)));
        }
    }

    @Test
    public void fanout2() throws Exception{
        for (int i=0;i<10;i++){
            helloSender.sendFanoutMessage2(new User(String.valueOf(i),String.valueOf(i)));
        }
    }
}
