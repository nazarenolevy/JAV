package com.despegar.tpintegradorfinal.dto;

import java.math.BigDecimal;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class PriceDto {

    private BigDecimal base;
    private Boolean finalPrice;
    private CurrencyDto currency;

    public PriceDto() {
    }

    public CurrencyDto getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyDto currencyDto) {
        this.currency = currencyDto;
    }

    public BigDecimal getBase() {
        return base;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public Boolean getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Boolean finalPrice) {
        this.finalPrice = finalPrice;
    }
}
