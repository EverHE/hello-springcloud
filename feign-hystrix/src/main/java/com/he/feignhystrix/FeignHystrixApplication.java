package com.he.feignhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class FeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixApplication.class, args);
    }
}
