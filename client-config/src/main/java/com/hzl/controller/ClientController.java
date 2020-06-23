package com.hzl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: newcloud
 * @description
 * @author: zhilin
 * @create: 2020-06-23 21:59
 **/
@RestController
@RefreshScope
public class ClientController {
    @Value("${myConfig}")
    private String string;

    @RequestMapping("config")
    public String getConfig(){
        String str="config="+string;
        return str;
    }
}
