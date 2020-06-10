package com.lind.nacosdemo;

import com.lind.mongodb.EnableMongodb;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.lind.nacosdemo", "com.lind.redis"})
@EnableDiscoveryClient
@EnableMongodb
@EnableFeignClients
@Slf4j
public class NacosDemoApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosDemoApplication.class, args);
        String propertySources = applicationContext.getEnvironment().getProperty("author");
        log.info("value:{}", propertySources);
    }

}
