package com.example.order.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import java.util.UUID;
import org.springframework.stereotype.Component;

/**
 * @description: 自定义 feign 请求拦截器
 * @author: huy
 * @date: 2025/5/10 22:27
 * @version: 1.0
 */
@Component
public class XTokenRequestInterceptor implements RequestInterceptor {

    /**
     * 请求拦截器
     *
     * @param requestTemplate 请求模板
     */
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("XToken", UUID.randomUUID().toString());
    }
}
