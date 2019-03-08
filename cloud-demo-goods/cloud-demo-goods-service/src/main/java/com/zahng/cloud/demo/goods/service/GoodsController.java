package com.zahng.cloud.demo.goods.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zgj
 * @since 2019/3/8 9:51
 */
@RestController
public class GoodsController {
    @RequestMapping("/goods/ping")
    public String hello() {
        return "from goodsController";
    }
}
