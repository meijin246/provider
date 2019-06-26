package com.provider.demo.service.impl;

import com.provider.demo.configs.RefreshConfig;
import com.provider.demo.entity.User;
import com.provider.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private RefreshConfig user;

    @Override
    public String recevice() {
//        User user = new User();
//        user.setName(name);
//        user.setAddress(address);
//        user.setAge(age);
//        System.out.println(user);

        return user.refreshUser().toString();
    }
}
