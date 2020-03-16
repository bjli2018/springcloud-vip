package com.enjoy.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by BJLI on 2020/3/5.
 */
@Data
public class Product implements Serializable {
    private Long productId;
    private String productName;
    private String productDesc;
}
