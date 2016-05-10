package com.despegar.tpintegradorfinal.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class HotelDto {

    private String id;
    private String description;
    private int stars;
    private String name;
    private String address;
    private String mainPicture;
    private BigDecimal rating;
    private GeoLocationDto geoLocation;
    private CityDto city;
    private List<ReviewsDto> reviews;
    private List<AmenitieDto> amenities;
    private PriceDto price;

    public HotelDto() {
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

    public GeoLocationDto getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocationDto geoLocation) {
        this.geoLocation = geoLocation;
    }

    public CityDto getCity() {
        return city;
    }

    public void setCity(CityDto city) {
        this.city = city;
    }

    public List<ReviewsDto> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewsDto> reviews) {
        this.reviews = reviews;
    }

    public List<AmenitieDto> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<AmenitieDto> amenities) {
        this.amenities = amenities;
    }

    public PriceDto getPrice() {
        return price;
    }

    public void setPrice(PriceDto price) {
        this.price = price;
    }
}
