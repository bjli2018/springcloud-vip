package com.enjoy.dao;

import com.enjoy.ProductApp;
import com.enjoy.dao.mapper.ProductMapper;
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
public class ProductMapperTest {
    @Autowired
    private ProductMapper productMapper;
    @Test
    public void testSelectById() {
        System.out.println(productMapper.selectById(1));
    }
}
