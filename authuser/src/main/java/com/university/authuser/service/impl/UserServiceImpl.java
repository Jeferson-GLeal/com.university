package com.university.authuser.service.impl;

import com.university.authuser.repositories.UserRepository;
import com.university.authuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

}
