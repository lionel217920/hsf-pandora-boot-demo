package com.alibaba.edas.consumer.config;

import com.alibaba.boot.hsf.annotation.HSFConsumer;
import com.alibaba.edas.api.HelloWorldService;

public class HSFConfig {

    @HSFConsumer(clientTimeout = 3000, serviceVersion = "1.0.0")
    private HelloWorldService helloWorldService;
}
