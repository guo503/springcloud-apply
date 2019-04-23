package com.tsyj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 594781919@qq.com
 * @date: 2018/5/8
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${name}")
    private  String name;

    @Value("${age}")
    private  String age;

    @Value("${version}")
    private  String version="开发环境";

    @RequestMapping("/test")
    public String test(){

        return "你好，我是"+name+",年龄："+age+"岁。当前环境："+version;
    }
}
