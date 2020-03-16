package com.enjoy.service;

import com.enjoy.ProductApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by BJLI on 2020/3/5.
 */
@SpringBootTest(classes = ProductApp.class)
@RunWith(SpringRunner.class)
public class ProductServiceTest {
    @Autowired
    private IProductService iProductService;
    @Test
    public void testGet() {
        System.out.println(iProductService.get(1));
    }
}
