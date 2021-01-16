package com.alibaba.edas.provider.service;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.alibaba.edas.api.HelloWorldService;

@HSFProvider(serviceInterface = HelloWorldService.class, serviceVersion = "1.0.0")
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String helloWorld(String echo) {
        return "provider" + echo;
    }
}
