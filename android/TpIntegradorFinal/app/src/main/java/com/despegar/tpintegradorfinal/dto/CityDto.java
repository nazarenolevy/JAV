package com.despegar.tpintegradorfinal.dto;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class CityDto {

    private int id;
    private String code;
    private String name;
    private CountryAndDivisionDto country;
    private CountryAndDivisionDto administrativeDivision;

    public CityDto() {
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

    public CountryAndDivisionDto getCountry() {
        return country;
    }

    public void setCountry(CountryAndDivisionDto country) {
        this.country = country;
    }

    public CountryAndDivisionDto getAdministrativeDivision() {
        return administrativeDivision;
    }

    public void setAdministrativeDivision(CountryAndDivisionDto administrativeDivision) {
        this.administrativeDivision = administrativeDivision;
    }
}
