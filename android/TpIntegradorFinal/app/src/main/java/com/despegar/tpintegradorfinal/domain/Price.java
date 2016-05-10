package com.despegar.tpintegradorfinal.domain;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by nazarenolevy on 10/05/16.
 */
public class Price implements Serializable{

    private CurrencyPrice currencyPrice;
    private BigDecimal base;

    public Price(){}

    public Price(CurrencyPrice currencyPrice, BigDecimal base) {
        this.currencyPrice = currencyPrice;
        this.base = base;
    }

    public CurrencyPrice getCurrencyPrice() {
        return currencyPrice;
    }

    public void setCurrencyPrice(CurrencyPrice currencyPrice) {
        this.currencyPrice = currencyPrice;
    }

    public BigDecimal getBase() {
        return base;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }
}
