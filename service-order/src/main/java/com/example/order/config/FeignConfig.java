package com.example.order.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: Feign 配置
 * @author: huy
 * @date: 2025/5/5 11:47
 * @version: 1.0
 */
@Configuration
public class FeignConfig {

    /**
     * 日志配置
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /**
     * 重试机制
     *
     * @return
     */
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default();
    }
}
