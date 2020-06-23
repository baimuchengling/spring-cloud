package com.hzl.controller;

import com.hzl.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    private OrderService orderService;

    @RequestMapping("query/{id}")
    public String query(@PathVariable String id) {
        System.out.println("feign start");
        return orderService.queryOrder(id);

    }
}
