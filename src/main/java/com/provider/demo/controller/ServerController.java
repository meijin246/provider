package com.provider.demo.controller;

import com.provider.demo.entity.Body;
import com.provider.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServerController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String helloServer(@RequestBody Body data){
        return "server callback " + data.getData() + " refresh: " + service.recevice();
    }
}
