package com.example.order.feign;

import com.example.product.entity.ProductEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 商品服务 Feign
 */
@FeignClient(value = "product-service") // Feign 客户端，指定调用微服务的名称
public interface ProductFeignClient {

    /**
     * 获取商品信息
     *
     * 调用该方法时，是给 product-service 服务的 getProductById 方法发送请求
     * @param id
     */
    @GetMapping("/getProductById/{id}")
    ProductEntity getProductById(@PathVariable("id") Long id);

}
