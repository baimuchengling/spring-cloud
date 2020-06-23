package com.hzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: newcloud
 * @description
 * @author: zhilin
 * @create: 2020-06-20 12:46
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Hystrixpplication {
    public static void main(String[] args) {
        SpringApplication.run(Hystrixpplication.class,args);
    }
}
