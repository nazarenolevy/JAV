package com.despegar.tpintegradorfinal.dto;

/**
 * Created by nazarenolevy on 10/05/16.
 */
public class CurrencyDto {
    private String code;
    private String mask;

    public CurrencyDto(){}

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
