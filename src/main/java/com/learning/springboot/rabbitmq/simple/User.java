package com.learning.springboot.rabbitmq.simple;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable {
    private String userName;
    private String mobile;

    public User(String userName, String mobile) {
        this.userName = userName;
        this.mobile = mobile;
    }
}
