package com.hzl.service;

import org.springframework.stereotype.Component;

/**
 * @program: newcloud
 * @description
 * @author: zhilin
 * @create: 2020-06-21 09:36
 **/
@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public String queryOrder(String id) {
        System.out.println("hystrix start");
        return "sorry,server can not access";
    }
}
