package com.he.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

    public static void main(String[] args) {
//        System.out.println("================================================== 开始启动 Config Server配置中心服务 =============================================================");
//        System.out.println("请在控制台指定Config Server配置中心服务的端口号 —— [端口号随意指定，注意不要与本机端口号出现冲突即可]");
//
//        Scanner scanner = new Scanner(System.in);
//        String port = scanner.nextLine(); //让用户指定端口号
//        new SpringApplicationBuilder(EurekaClientApplication.class).properties("server.port=" + port).run(args);//启动项目
//
//        System.out.println("================================================== Config Server配置中心服务启动成功 =============================================================");

        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
