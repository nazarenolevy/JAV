package com.despegar.tpintegradorfinal.gui.details;

import android.content.Context;
import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.despegar.tpintegradorfinal.R;
import com.despegar.tpintegradorfinal.domain.Amenity;
import com.despegar.tpintegradorfinal.domain.Hotel;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetailsHotelImageFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetailsHotelImageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsHotelImageFragment extends Fragment {

    private Hotel hotel;
    private ImageView hotelImage;
    private TextView hotelName;
    private TextView rating;
    private RatingBar stars;
    private TextView description;
    private ImageView readMore;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_details_hotel_image, container, false);

        hotel = (Hotel) getActivity().getIntent().getSerializableExtra("Hotel");
        hotelImage = (ImageView) view.findViewById(R.id.detailsHotelImageView);
        hotelName = (TextView) view.findViewById(R.id.detailHotelName);
        rating = (TextView) view.findViewById(R.id.detailHotelRating);
        stars = (RatingBar) view.findViewById(R.id.detailsHotelStars);
        description = (TextView) view.findViewById(R.id.largeDescription);
        readMore = (ImageView) view.findViewById(R.id.readMore);


        this.bindHotel(hotel);

        hotelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(v.getContext());

                LayoutInflater inflater = LayoutInflater.from(v.getContext());
                final View view = inflater.inflate(R.layout.image_dialog, null);
                ImageView dialogHotelImage = (ImageView) view.findViewById(R.id.dialogHotelImage);

                Picasso.with(getContext()).load(hotel.getMainPicture()).into(dialogHotelImage);

                alertDialog.setView(view);
                alertDialog.show();
            }
        });

        description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextViewCompat.getMaxLines(description) == 6) {
                    description.setMaxLines(Integer.MAX_VALUE);
                    readMore.setVisibility(v.GONE);

                } else {
                    description.setMaxLines(6);
                    readMore.setVisibility(v.VISIBLE);

                }
            }
        });

        return view;
    }


    private void bindHotel(Hotel hotel) {

        Picasso.with(getContext()).load(hotel.getMainPicture()).into(hotelImage);
        hotelName.setText(hotel.getName());
        rating.setText(hotel.getRating() + " puntos");
        stars.setNumStars(hotel.getStars());
        description.setText(hotel.getDescription());

        this.bindAmenities(hotel.getAmenities());

    }

    private void bindAmenities(List<Amenity> amenities) {

        LinearLayout container = (LinearLayout) view.findViewById(R.id.acomodityContainer);
        ImageView iconAmenity;
        TextView textAmenity;

        for (Amenity amenity : amenities) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(getContext().LAYOUT_INFLATER_SERVICE);
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.amenity_row, null);

            textAmenity = (TextView) linearLayout.findViewById(R.id.acomodityText);
            textAmenity.setText(amenity.getDescription());

            iconAmenity = (ImageView) linearLayout.findViewById(R.id.acomodityIcon);

            switch (amenity.getId()) {
                case "WIFI":
                    iconAmenity.setImageResource(R.drawable.wifi);
                    break;
                case "BREAKFST":
                    iconAmenity.setImageResource(R.drawable.coffee_cup);
                    break;
                case "PARKING":
                    iconAmenity.setImageResource(R.drawable.parking_sign);
                    break;
                case "PISCN":
                    iconAmenity.setImageResource(R.drawable.pool);
                    break;
            }

            container.addView(linearLayout);

        }

    }


}
