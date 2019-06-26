package com.provider.demo.configs;

import com.provider.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@RefreshScope
public class RefreshConfig {

    @Value("${test.service.name}")
    private String name;

    @Value("${test.service.address}")
    private String address;

    @Value("${test.service.age}")
    private String age;

    public User refreshUser(){
        User user = new User();
        user.setName(name);
        user.setAddress(address);
        user.setAge(age);
        System.out.println(user);
        return user;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
