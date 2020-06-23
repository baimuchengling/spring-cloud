package com.hzl.data;

import com.alibaba.fastjson.JSONObject;
import com.hzl.entity.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: newcloud
 * @description 模拟数据库的数据存储
 * @author: zhilin
 * @create: 2020-06-20 15:43
 **/
@Component
public class OrderDatail {
    public static List<Order> orderList = new ArrayList<>();

    static {
        for (int i = 1; i <= 10; i++) {
            Order order = new Order();
            order.setId(i);
            order.setName("商品" + i);
            order.setPlace("北京");
            order.setPrice(Math.random() * 100);
            order.setPublishDt(LocalDateTime.now());
            orderList.add(order);
        }
    }


    public boolean addDetail(Order order) {
        boolean add = orderList.add(order);
        return add;
    }

    public String query(String id) {
        for (Order order : orderList) {
            if (Integer.parseInt(id) == order.getId()) {
                return JSONObject.toJSONString(order);
            }
        }
        return "";
    }

}
