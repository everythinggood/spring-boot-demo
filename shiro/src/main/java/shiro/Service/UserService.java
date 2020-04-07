package shiro.Service;


import shiro.entity.User;

public interface UserService {
    User findByUserName(String userName);
}