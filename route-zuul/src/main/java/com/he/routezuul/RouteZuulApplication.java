package com.he.routezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//声明一个Zuul代理
@EnableZuulProxy
//注册到Eureka
@EnableDiscoveryClient
@SpringBootApplication
public class RouteZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(RouteZuulApplication.class, args);
    }

}
