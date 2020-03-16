package com.enjoy.service.impl;

import com.enjoy.dao.entity.Product;
import com.enjoy.dao.mapper.ProductMapper;
import com.enjoy.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by BJLI on 2020/3/5.
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public Product get(long id) {
        return productMapper.selectById(id);
    }
}
