package com.despegar.tpintegradorfinal.gui.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.despegar.tpintegradorfinal.R;
import com.despegar.tpintegradorfinal.domain.Hotel;
import com.despegar.tpintegradorfinal.domain.Price;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by nazarenolevy on 07/05/16.
 */
public class ListHotelAdapter extends RecyclerView.Adapter<ListHotelAdapter.HotelItemViewHolder> {

    private List<Hotel> hotels;
    private Context context;
    private ListHotelFragmentInterface listHotelFragmentInterface;


    public ListHotelAdapter(Context context, List<Hotel> hotels, ListHotelFragmentInterface listHotelFragmentInterface) {
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
        holder.nameHotel.setText(hotel.getName());
        holder.ratingBar.setNumStars(hotel.getStars());
        holder.price.setText(hotel.getPrice().getCurrencyPrice().getMask() + hotel.getPrice().getBase());
        holder.rating.setText(hotel.getRating().toString() + " puntos");

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

    public static class HotelItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView hotelImageView;
        private TextView nameHotel;
        private RatingBar ratingBar;
        private TextView price;
        private TextView rating;


        public HotelItemViewHolder(View v) {
            super(v);

            hotelImageView = (ImageView) v.findViewById(R.id.hotelImageView);
            nameHotel = (TextView) v.findViewById(R.id.hotelName);
            ratingBar = (RatingBar) v.findViewById(R.id.stars);
            price = (TextView) v.findViewById(R.id.hotelPrice);
            rating = (TextView) v.findViewById(R.id.hotelRating);

        }


    }
}
