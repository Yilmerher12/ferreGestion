package com.ferregestion.ferreGestion.service;

import com.ferregestion.ferreGestion.model.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Scope("prototype")
@Component
public class SaleDraft {
    private List<String> productList = new ArrayList<>();

    public void addProduct (String productCode){
        productList.add(productCode);
        System.out.println("El producto se agrego!");
    }

    public List<String> getProductsList (){
        return productList;
    }
}
