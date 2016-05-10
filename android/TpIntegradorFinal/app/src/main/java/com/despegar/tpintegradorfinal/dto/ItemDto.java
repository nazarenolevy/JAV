package com.despegar.tpintegradorfinal.dto;

import java.io.Serializable;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class ItemDto{

    private HotelDto hotel;
    private PriceDto price;

    public ItemDto() {
    }

    public HotelDto getHotel() {
        return hotel;
    }

    public void setHotel(HotelDto hotel) {
        this.hotel = hotel;
    }

    public PriceDto getPrice() {
        return price;
    }

    public void setPrice(PriceDto price) {
        this.price = price;
    }
}
