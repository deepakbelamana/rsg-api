package com.RepSetGo.RepSetGo.Services;

import com.RepSetGo.RepSetGo.Repository.UserRepo;
import com.RepSetGo.RepSetGo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    PasswordEncoder pwdEncoder;
    @Override
    public User SignUpUser(User user) {
        user.setPassword(pwdEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
}
