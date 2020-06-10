package com.lind.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("nacos-config")
public interface NacosConfigClient {
    @RequestMapping("/get")
    String get();
}
