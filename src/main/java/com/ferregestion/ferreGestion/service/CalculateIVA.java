package com.ferregestion.ferreGestion.service;

import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class CalculateIVA {

    private static final BigDecimal IVA_RATE =new BigDecimal( "0.19");

    public BigDecimal getIva (BigDecimal price){
        return IVA_RATE.multiply(price).setScale(2, RoundingMode.HALF_UP);
    }


    public BigDecimal totalWithIVA(BigDecimal price){
        return price.add(getIva(price));
    }

}
