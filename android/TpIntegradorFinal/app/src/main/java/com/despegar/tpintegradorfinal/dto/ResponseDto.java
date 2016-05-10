package com.despegar.tpintegradorfinal.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class ResponseDto implements Serializable{

    private List<ItemDto> items;

    public ResponseDto() {
    }

    public List<ItemDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDto> items) {
        this.items = items;
    }
}
