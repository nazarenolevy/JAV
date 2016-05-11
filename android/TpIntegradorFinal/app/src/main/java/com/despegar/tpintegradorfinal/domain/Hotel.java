package com.despegar.tpintegradorfinal.domain;

import android.support.v7.widget.RecyclerView;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/**
 * Created by nazarenolevy on 07/05/16.
 */
public class Hotel implements Serializable{

    private String id;
    private String description;
    private int stars;
    private String name;
    private String address;
    private String mainPicture;
    private BigDecimal rating;
    private GeoLocation geoLocation;
    private List<Review> reviews;
    private List<Amenity> amenities;
    private Price price;

    public Hotel(){

    }

    public Hotel(Price price, String id, String description, int stars, String name, String address, String mainPicture, BigDecimal rating, GeoLocation geoLocation, List<Review> reviews, List<Amenity> amenities) {
        this.price = price;
        this.id = id;
        this.description = description;
        this.stars = stars;
        this.name = name;
        this.address = address;
        this.mainPicture = mainPicture;
        this.rating = rating;
        this.geoLocation = geoLocation;
        this.reviews = reviews;
        this.amenities = amenities;
    }

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

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<Amenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }


}
