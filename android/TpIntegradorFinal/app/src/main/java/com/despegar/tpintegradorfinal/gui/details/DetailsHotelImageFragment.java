package com.despegar.tpintegradorfinal.gui.details;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.despegar.tpintegradorfinal.R;
import com.despegar.tpintegradorfinal.domain.Hotel;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details_hotel_image, container, false);

        hotel = (Hotel) getActivity().getIntent().getSerializableExtra("Hotel");
        hotelImage = (ImageView) view.findViewById(R.id.detailsHotelImageView);
        hotelName = (TextView) view.findViewById(R.id.detailHotelName);
        rating = (TextView) view.findViewById(R.id.detailHotelRating);


        this.bindHotel(hotel);

        return view;
    }


    private void bindHotel(Hotel hotel){

        Picasso.with(getContext()).load(hotel.getMainPicture()).into(hotelImage);
        hotelName.setText(hotel.getName());
        rating.setText(hotel.getRating() + " puntos");




    }


}
