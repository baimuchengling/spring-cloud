package com.hzl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

/**
 * @program: newcloud
 * @description oreder
 * @author: zhilin
 * @create: 2020-06-20 12:46
 **/
@RequestMapping("order")
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("query/{id}")
    public String query(@PathVariable String id){
        System.out.println("ribbon start");
        String forObject = restTemplate.getForObject("http://producer/order/query?id="+id, String.class);
        return forObject;
    }
}
