package com.lind.consumer.controller;

import com.lind.consumer.feign.NacosConfigClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    NacosConfigClient nacosConfigClient;

    @GetMapping("/ok")
    public ResponseEntity ok() {
        return ResponseEntity.ok(nacosConfigClient.get());
    }
}
