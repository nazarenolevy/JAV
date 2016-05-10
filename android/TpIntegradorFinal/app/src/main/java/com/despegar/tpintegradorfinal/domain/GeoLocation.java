package com.despegar.tpintegradorfinal.domain;

import java.io.Serializable;

/**
 * Created by nazarenolevy on 07/05/16.
 */
public class GeoLocation implements Serializable{

    private long longitude;
    private long latitude;

    public GeoLocation(){

    }

    public GeoLocation(long latitude, long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }
}
