package com.despegar.tpintegradorfinal.domain;

import java.io.Serializable;
import java.util.Currency;

/**
 * Created by nazarenolevy on 10/05/16.
 */
public class CurrencyPrice implements Serializable{

    private String code;
    private String mask;

    public CurrencyPrice(){}

    public CurrencyPrice(String code, String mask) {
        this.code = code;
        this.mask = mask;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
}
