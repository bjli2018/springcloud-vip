package com.enjoy.dao.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author bob
 * @since 2020-03-08
 */
public class Product extends Model<Product> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "productId", type = IdType.AUTO)
    private Long productId;

    @TableField("productName")
    private String productName;

    @TableField("productDesc")
    private String productDesc;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Product{" +
        ", productId=" + productId +
        ", productName=" + productName +
        ", productDesc=" + productDesc +
        "}";
    }
}
