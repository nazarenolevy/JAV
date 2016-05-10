package com.despegar.tpintegradorfinal.dto;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class CountryAndDivisionDto {

    private int id;
    private String code;
    private String name;

    public CountryAndDivisionDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
