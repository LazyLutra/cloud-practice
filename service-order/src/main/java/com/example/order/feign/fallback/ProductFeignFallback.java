package com.example.order.feign.fallback;

import com.example.order.feign.ProductFeignClient;
import com.example.product.entity.ProductEntity;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;

/**
 * @description: 兜底数据
 * @author: huy
 * @date: 2025/5/10 22:51
 * @version: 1.0
 */
@Component
public class ProductFeignFallback implements ProductFeignClient {

    /**
     * 获取商品信息接口兜底数据返回
     *
     * @param id
     * @return
     */
    @Override
    public ProductEntity getProductById(Long id) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(id);
        productEntity.setPrice(new BigDecimal("1"));
        productEntity.setName("未知商品");
        productEntity.setNum(1);
        return productEntity;
    }
}
