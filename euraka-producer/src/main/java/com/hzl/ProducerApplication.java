package com.hzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: newcloud
 * @description
 * @author: zhilin
 * @create: 2020-06-20 12:54
 **/
@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class,args);
        System.out.println("args = " + args);
    }
}
