package com.hzl.controller;

import com.hzl.data.OrderDatail;
import com.hzl.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @program: newcloud
 * @description
 * @author: zhilin
 * @create: 2020-06-20 12:54
 **/
@RequestMapping("order")
@RestController
public class OrderController {

    @Autowired
    private OrderDatail orderDatail;

    @RequestMapping("add/{num}")
    public void add(@PathVariable("num") String string) throws Exception{
        int parseInt = Integer.parseInt(string);
        for (int i = 0; i < parseInt; i++) {
            Order order=new Order();
            order.setId(i);
            order.setName("商品"+i);
            order.setPlace("北京");
            order.setPrice(Math.random()*100);
            order.setPublishDt(LocalDateTime.now().plusHours(new Random().nextLong()));
            orderDatail.addDetail(order);
        }
    }
    @RequestMapping("query")
    public String query(@RequestParam("id") String id){
        System.out.println("producer start");

        return orderDatail.query(id);
    }
}
