package com.zhang.cloud.demo.test;

import com.zhang.cloud.demo.goods.api.GoodsClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.zhang.cloud.demo.goods.api")
@EnableDiscoveryClient
@RestController
public class CloudDemoTestApplication {

    @Resource
    private GoodsClient goodsClient;

    public static void main(String[] args) {
        SpringApplication.run(CloudDemoTestApplication.class, args);
    }

    @RequestMapping("/test")
    public String test() {
        return goodsClient.hello();
    }

}
