package com.despegar.tpintegradorfinal.dto;

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

        CurrencyPrice currencyPrice = new CurrencyPrice();


        List<ItemDto> itemsDto = responseDto.getItems();


        for(ItemDto itemDto : itemsDto){
            HotelDto hotelDto = itemDto.getHotel();
            PriceDto priceDto = itemDto.getPrice();
            CurrencyDto currencyDto = itemDto.getPrice().getCurrency();
            Price price = new Price();

            Hotel hotel = new Hotel();
            hotel.setId(hotelDto.getId());
            hotel.setName(hotelDto.getName());
            hotel.setAddress(hotelDto.getAddress());
            hotel.setMainPicture(hotelDto.getMainPicture());
            hotel.setDescription(hotelDto.getDescription());
            hotel.setRating(hotelDto.getRating());
            hotel.setStars(hotelDto.getStars());

            price.setBase(priceDto.getBase());

            currencyPrice.setCode(currencyDto.getCode());
            currencyPrice.setMask(currencyDto.getMask());
            price.setCurrencyPrice(currencyPrice);

            hotel.setPrice(price);




            hotels.add(hotel);

        }

        return hotels;

    }
}
