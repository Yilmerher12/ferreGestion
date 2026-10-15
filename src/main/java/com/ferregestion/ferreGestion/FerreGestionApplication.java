package com.ferregestion.ferreGestion;

import com.ferregestion.ferreGestion.model.Product;
import com.ferregestion.ferreGestion.repository.ProductRepository;
import com.ferregestion.ferreGestion.service.PriceGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class FerreGestionApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext seeContext = SpringApplication.run(FerreGestionApplication.class, args);

        PriceGenerator generator1 = seeContext.getBean(PriceGenerator.class);

        System.out.println(generator1.generatePriceReport("MAR-001",new BigDecimal("3")));

        ProductRepository productsCollection = seeContext.getBean(ProductRepository.class);

        for (Product product: productsCollection.getProductsCollection()){
            System.out.println(product.toString());
        }
    }

}
