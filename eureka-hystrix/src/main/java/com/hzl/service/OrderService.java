package com.hzl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: newcloud
 * @description
 * @author: zhilin
 * @create: 2020-06-21 00:02
 **/
@FeignClient(value = "producer",fallback = OrderServiceImpl.class)
@Component
public interface OrderService {
    @RequestMapping(value = "order/query",method = RequestMethod.GET)
    String queryOrder(@RequestParam("id") String id);
}
