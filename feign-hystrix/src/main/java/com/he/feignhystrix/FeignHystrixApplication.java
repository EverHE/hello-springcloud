package com.he.feignhystrix;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class FeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     *策略类	命名	说明
     * RandomRule	随机策略	随机选择 Server
     * RoundRobinRule	轮训策略	按顺序循环选择 Server(默认)
     * RetryRule	重试策略	在一个配置时问段内当选择 Server 不成功，则一直尝试选择一个可用的 Server
     * BestAvailableRule	最低并发策略	逐个考察 Server，如果 Server 断路器打开，则忽略，再选择其中并发连接最低的 Server
     * AvailabilityFilteringRule	可用过滤策略	过滤掉一直连接失败并被标记为 circuit tripped 的 Server，过滤掉那些高并发连接的 Server（active connections 超过配置的网值）
     * ResponseTimeWeightedRule	响应时间加权策略	根据 Server 的响应时间分配权重。响应时间越长，权重越低，被选择到的概率就越低；响应时间越短，权重越高，被选择到的概率就越高。这个策略很贴切，综合了各种因素，如：网络、磁盘、IO等，这些因素直接影响着响应时间
     * ZoneAvoidanceRule	区域权衡策略	综合判断 Server 所在区域的性能和 Server 的可用性轮询选择 Server，并且判定一个 AWS Zone 的运行性能是否可用，剔除不可用的 Zone 中的所有 Server
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        return new BestAvailableRule();
    }
}
