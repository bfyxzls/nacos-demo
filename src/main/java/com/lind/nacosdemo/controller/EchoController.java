package com.lind.nacosdemo.controller;

import com.lind.mongodb.MongodbConfig;
import com.lind.redis.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //配置自动更新
public class EchoController {


    @Autowired
    RedisConfig redisConfig;
    @Autowired
    MongodbConfig mongodbConfig;
    @Value("${user.name}")
    private String username;

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }

    @RequestMapping("/get")
    public String get() {
        redisConfig.print();
        mongodbConfig.print();
        return username;
    }
}