package com.enjoy.controller;

import com.enjoy.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BJLI on 2020/3/5.
 */
@RestController
@RequestMapping("/prodcut")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/get/{id}")
    public Object get(@PathVariable("id") long id) {
        return this.iProductService.get(id) ;
    }

    @RequestMapping(value="/discover")
    public Object discover() {
        return this.client ;
    }
}
