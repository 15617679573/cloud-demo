package com.zhang.cloud.demo.goods.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zgj
 * @since 2019/3/8 9:45
 */
@FeignClient(name = "cloud-demo-goods")
public interface GoodsClient {
    @RequestMapping("/goods/ping")
    String hello();
}
