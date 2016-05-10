package com.despegar.tpintegradorfinal.gui.main;

import android.content.Intent;
import android.nfc.tech.NfcBarcode;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.despegar.tpintegradorfinal.R;
import com.despegar.tpintegradorfinal.domain.Hotel;
import com.despegar.tpintegradorfinal.dto.DomainDto;
import com.despegar.tpintegradorfinal.dto.ResponseDto;
import com.despegar.tpintegradorfinal.gui.details.DetailsHotelActivity;
import com.despegar.tpintegradorfinal.service.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.StringReader;
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
public class ListHotelFragment extends Fragment implements ListHotelFragmentInterface {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private ListHotelAdapter listHotelAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_hotel, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewFragmentListHotel);

        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(getContext());

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, getString(R.string.requestPublicUrl),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        JsonFactory jsonFactory = new JsonFactory();
                        ResponseDto responseDTO = jsonFactory.fromJson(new StringReader(response), new TypeReference<ResponseDto>() {
                        });

                        List<Hotel> hotels = DomainDto.bindToDomain(responseDTO);

                        listHotelAdapter = new ListHotelAdapter(getContext(), hotels, ListHotelFragment.this);
                        recyclerView.setAdapter(listHotelAdapter);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(ListHotelFragment.this.toString(), "Error on service: " + error.getMessage());
                throw new RuntimeException(error.getMessage());
            }
        });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);

        // Inflate the layout for this fragment
        linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return view;

    }

    @Override
    public void onItemClick(Hotel hotel) {
        Intent i = new Intent(getActivity(), DetailsHotelActivity.class);
        i.putExtra("Hotel", hotel);
        startActivity(i);
    }
}
