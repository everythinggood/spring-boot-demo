package com.learning.springboot.rabbitmq.simple;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private String mobile;

    public User(String userName, String mobile) {
        this.userName = userName;
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
