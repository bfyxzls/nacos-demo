package com.lind.nacosdemo;

import com.lind.mongodb.EnableMongodb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.lind.nacosdemo", "com.lind.redis"})
@EnableDiscoveryClient
@EnableMongodb
@EnableFeignClients
public class NacosDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDemoApplication.class, args);
    }
}
