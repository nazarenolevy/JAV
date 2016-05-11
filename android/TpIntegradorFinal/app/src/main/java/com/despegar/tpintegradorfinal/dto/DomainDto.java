package com.despegar.tpintegradorfinal.dto;

import com.despegar.tpintegradorfinal.domain.Amenity;
import com.despegar.tpintegradorfinal.domain.CurrencyPrice;
import com.despegar.tpintegradorfinal.domain.Hotel;
import com.despegar.tpintegradorfinal.domain.Price;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class DomainDto {

    public static List<Hotel> bindToDomain(ResponseDto responseDto){

        List<Hotel> hotels = new ArrayList<Hotel>();
        List<ItemDto> itemsDto = responseDto.getItems();


        for(ItemDto itemDto : itemsDto){
            HotelDto hotelDto = itemDto.getHotel();
            PriceDto priceDto = itemDto.getPrice();
            CurrencyDto currencyDto = itemDto.getPrice().getCurrency();
            List<AmenityDto> amenitiesDto = itemDto.getHotel().getAmenities();

            Hotel hotel = new Hotel();
            hotel.setId(hotelDto.getId());
            hotel.setName(hotelDto.getName());
            hotel.setAddress(hotelDto.getAddress());
            hotel.setMainPicture(hotelDto.getMainPicture());
            hotel.setDescription(hotelDto.getDescription());
            hotel.setRating(hotelDto.getRating());
            hotel.setStars(hotelDto.getStars());

            Price price = new Price();
            price.setBase(priceDto.getBase());
            CurrencyPrice currencyPrice = new CurrencyPrice();
            currencyPrice.setCode(currencyDto.getCode());
            currencyPrice.setMask(currencyDto.getMask());
            price.setCurrencyPrice(currencyPrice);
            hotel.setPrice(price);

            List<Amenity> amenities = new ArrayList<Amenity>();
            for (AmenityDto amenityDto : amenitiesDto){
                Amenity amenity = new Amenity();
                amenity.setId(amenityDto.getId());
                amenity.setDescription(amenityDto.getDescription());
                amenities.add(amenity);
            }
            hotel.setAmenities(amenities);

            hotels.add(hotel);

        }

        return hotels;

    }
}
