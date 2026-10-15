package com.ferregestion.ferreGestion.service;

import com.ferregestion.ferreGestion.model.Product;
import com.ferregestion.ferreGestion.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

@Component
public class PriceGenerator {
    private final CalculateIVA calculator;
    private final ProductRepository productRepository;

    public PriceGenerator(CalculateIVA calculator, ProductRepository productRepository) {
        this.calculator = calculator;
        this.productRepository = productRepository;
    }

    public String generatePriceReport (String productCode, BigDecimal productQuantity){
        Optional<Product> optionalProduct = productRepository.getProductByCode(productCode);

        if (optionalProduct.isEmpty()){
            return "no existe el producto";
        }
        Product realProduct = optionalProduct.get();
        BigDecimal subTotal = realProduct.getProductPrice().multiply(productQuantity).setScale(2, RoundingMode.HALF_UP);


        return "Producto: " + realProduct.getProductName()+ "\nSubtotal : " + subTotal + "\n " + "IVA: " + calculator.getIva(subTotal) + "\n " + "Final total: " + calculator.totalWithIVA(subTotal);
    }

}
