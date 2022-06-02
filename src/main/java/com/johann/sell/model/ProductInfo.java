package com.johann.sell.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "product_info")
public class ProductInfo {
    @Id
    @Column(name = "product_id", nullable = false, length = 32)
    private String id;

    @Column(name = "product_name", nullable = false, length = 64)
    private String productName;

    @Column(name = "product_price", nullable = false, precision = 8, scale = 2)
    private BigDecimal productPrice;

    @Column(name = "product_stock", nullable = false)
    private Integer productStock;

    @Column(name = "product_description", length = 64)
    private String productDescription;

    @Column(name = "product_icon", length = 512)
    private String productIcon;

    @Column(name = "product_status")
    private Integer productStatus;

    @Column(name = "category_type", nullable = false)
    private Integer categoryType;

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}