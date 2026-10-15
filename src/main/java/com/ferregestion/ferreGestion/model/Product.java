package com.ferregestion.ferreGestion.model;

import java.math.BigDecimal;

public class Product {
    private String productCode;
    private String productName;
    private BigDecimal productPrice;

    public Product(String productCode, String productName, BigDecimal productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "productCode: " + productCode+ ", productName: " + productName +
                ", productPrice: " + productPrice;
    }
}
