package com.ferregestion.ferreGestion.repository;

import com.ferregestion.ferreGestion.model.Product;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public class ProductRepository {
    private final List<Product> productsCollection = new ArrayList<>();

    public ProductRepository() {

        System.out.println("Constructor cantidad de productos: " + productsCollection.size());
    }

    @PostConstruct
    public void catalogInit(){
        Product cement = new Product("CEM-001", "Bolsa de Cemento", new BigDecimal("32500"));
        productsCollection.add(cement);

        Product hammer = new Product("MAR-001","Martillo metalico", new BigDecimal("10000"));
        productsCollection.add(hammer);

        Product wire = new Product("CAB-001", "Cable largo ", new BigDecimal("25000"));
        productsCollection.add(wire);

        System.out.println("Carga de productos: " + productsCollection.size());

    }

    public List<Product> getProductsCollection() {
        return productsCollection;
    }

    public Optional<Product> getProductByCode(String codeProduct){
        for (Product product: productsCollection) {
            if (product.getProductCode().equals(codeProduct)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    @PreDestroy
    public void catalogEnd(){
        System.out.println("Cierre del catalogo productos: " + productsCollection.size());
    }

}
