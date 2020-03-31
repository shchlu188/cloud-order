package com.scl.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @package: com.scl.order.controller
 * @author: chenglu
 * @create: 2020/3/31
 * Description:
 */
@RestController
public class OrderController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/server")
    public String testServer(){

        return "测试配置中心"+serverPort;
    }
}
