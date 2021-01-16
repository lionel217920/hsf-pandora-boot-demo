package com.alibaba.edas.provider.service;

import com.alibaba.edas.api.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String helloWorld(String echo) {
        return "provider" + echo;
    }
}
