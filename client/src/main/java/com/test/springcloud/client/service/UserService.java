package com.test.springcloud.client.service;

import com.test.springcloud.client.entity.User;

import java.util.List;


public interface UserService {
    public List<User> getUserInfo();
    
    public void insert(User user);
}
