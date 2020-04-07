package shiro.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import shiro.Service.UserService;
import shiro.entity.User;
import shiro.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
