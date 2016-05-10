package com.despegar.tpintegradorfinal.dto;

import java.math.BigDecimal;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class GeoLocationDto {

    private BigDecimal longitude;
    private BigDecimal latitude;

    public GeoLocationDto() {
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
