package com.enjoy.service;

import com.enjoy.config.FeignClientConfig;
import com.enjoy.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "SPRINGCLOUD-PRODUCT",configuration = FeignClientConfig.class)
public interface IProductClientService {
    @RequestMapping("/prodcut/get/{id}")
    public Product getProduct(@PathVariable("id")long id);
}
