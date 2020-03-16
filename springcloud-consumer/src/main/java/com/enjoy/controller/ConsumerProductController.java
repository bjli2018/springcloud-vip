package com.enjoy.controller;

import com.enjoy.service.IProductClientService;
import com.enjoy.vo.Product;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by BJLI on 2020/3/6.
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {
    public static final String PRODUCT_GET_URL = "http://SPRINGCLOUD-PRODUCT/prodcut/get/";
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @Resource
    private IProductClientService iproductClientService;

    @RequestMapping("/product/get")
    public Object getProduct(long id) {
        Product product = restTemplate.exchange(PRODUCT_GET_URL + id,
                HttpMethod.GET,new HttpEntity<Object>(httpHeaders), Product.class).getBody();
        return  product;
    }

    @RequestMapping("/feign/product/get")
    public Object getFeignProduct(long id) {
        Product product = iproductClientService.getProduct(id);
        return  product;
    }
}
