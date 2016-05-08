package com.despegar.tpintegradorfinal.gui.details;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.despegar.tpintegradorfinal.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetailsHotelImageFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetailsHotelImageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsHotelImageFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details_hotel_image, container, false);


        return view;
    }


}
