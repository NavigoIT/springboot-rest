package com.rayapati.springbootrest.service;

import com.rayapati.springbootrest.model.User;
import com.rayapati.springbootrest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveuser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

}
