package com.test.springcloud.client.service.impl;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.test.springcloud.client.entity.User;
import com.test.springcloud.client.mapper.UserMapper;
import com.test.springcloud.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo(){
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(1, 10);
        return userMapper.selectAll();
    }

    //@Transactional开启事务
    @Transactional
	public void insert(User user) {
		userMapper.insert(user);
	}
}
