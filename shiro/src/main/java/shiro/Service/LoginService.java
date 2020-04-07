package shiro.Service;


import shiro.entity.LoginResult;

public interface LoginService {

    LoginResult login(String userName, String password);

    void logout();
}