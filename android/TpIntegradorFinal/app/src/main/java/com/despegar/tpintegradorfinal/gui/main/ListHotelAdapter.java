package com.despegar.tpintegradorfinal.gui.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.despegar.tpintegradorfinal.R;
import com.despegar.tpintegradorfinal.domain.Hotel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by nazarenolevy on 07/05/16.
 */
public class ListHotelAdapter extends RecyclerView.Adapter<ListHotelAdapter.HotelItemViewHolder>{

    private List<Hotel> hotels;
    private Context context;
    private ListHotelFragmentInterface listHotelFragmentInterface;


    public ListHotelAdapter(Context context,List<Hotel> hotels, ListHotelFragmentInterface listHotelFragmentInterface){
        this.context = context;
        this.hotels = hotels;
        this.listHotelFragmentInterface = listHotelFragmentInterface;
    }


    @Override
    public HotelItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_hotel_item, parent, false);

        HotelItemViewHolder hotelItemViewHolder = new HotelItemViewHolder(view);

        return hotelItemViewHolder;
    }

    @Override
    public void onBindViewHolder(HotelItemViewHolder holder, int position) {
        final Hotel hotel = hotels.get(position);

        Picasso.with(context).load(hotel.getMainPicture()).into(holder.hotelImageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listHotelFragmentInterface.onItemClick(hotel);
            }
        });
    }

    @Override
    public int getItemCount() {
            return hotels.size();
    }

    public static class HotelItemViewHolder extends RecyclerView.ViewHolder{

        private ImageView hotelImageView;

        public HotelItemViewHolder(View v){
            super(v);

            hotelImageView = (ImageView) v.findViewById(R.id.hotelImageView);

        }


    }
}
