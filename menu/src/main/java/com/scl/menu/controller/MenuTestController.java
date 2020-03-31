package com.scl.menu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @package: com.scl.menu.controller
 * @author: chenglu
 * @create: 2020/4/1
 * Description: 测试菜单服务环境搭建
 */
@RestController
@RequestMapping("/menu")
public class MenuTestController {
    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/test")
    public String test() {
        return "测试菜单服务环境搭建\t" + serverPort;
    }
}
