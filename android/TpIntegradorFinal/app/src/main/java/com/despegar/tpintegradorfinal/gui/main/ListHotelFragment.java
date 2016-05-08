package com.despegar.tpintegradorfinal.gui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.despegar.tpintegradorfinal.R;
import com.despegar.tpintegradorfinal.domain.Hotel;
import com.despegar.tpintegradorfinal.gui.details.DetailsHotelActivity;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListHotelFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListHotelFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListHotelFragment extends Fragment implements ListHotelFragmentInterface{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_hotel, container, false);

        //TODO
        List<Hotel> hotels = new ArrayList<Hotel>();
        Hotel hotel = new Hotel();
        hotel.setMainPicture("http://ar.staticontent.com/media/pictures/7aca8010-51f6-4767-b484-e4c024df79ec");
        hotels.add(hotel);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewFragmentListHotel);
        recyclerView.setAdapter(new ListHotelAdapter(getContext(),hotels, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;

    }

    @Override
    public void onItemClick(Hotel hotel){
        Intent i = new Intent(getActivity(), DetailsHotelActivity.class);
        i.putExtra("Hotel", hotel);
        startActivity(i);
    }
}
