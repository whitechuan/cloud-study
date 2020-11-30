package com.zpc.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * ClassName: MyLoggerGeteWayFilter
 * Package: com.zpc.springcloud.filter
 * Description:
 *
 * @Date: 2020/11/30 14:45
 * @Author:zpc@qq.com
 */
@Component
@Slf4j
public class MyLoggerGeteWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("======进入日志 MyLoggerGeteWayFilter=====");
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (username == null){
            log.info("错误权限=======");
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
