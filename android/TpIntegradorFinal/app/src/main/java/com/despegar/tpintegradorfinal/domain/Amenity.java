package com.despegar.tpintegradorfinal.domain;

import java.io.Serializable;

/**
 * Created by nazarenolevy on 11/05/16.
 */
public class Amenity implements Serializable {

    private String id;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
