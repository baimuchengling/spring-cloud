package com.hzl.controller;

import com.hzl.ServerApplication;
import org.springframework.boot.SpringApplication;

import java.time.Instant;

/**
 * @program: newcloud
 * @description
 * @author: zhilin
 * @create: 2020-06-20 11:59
 **/
public class HelloController {
    public String hello(){
        String s = Instant.now().toString();
        System.out.println(s);
        return s;
    }
}
