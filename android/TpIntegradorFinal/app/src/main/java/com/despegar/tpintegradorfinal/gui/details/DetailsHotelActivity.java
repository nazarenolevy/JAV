package com.despegar.tpintegradorfinal.gui.details;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.despegar.tpintegradorfinal.R;

public class DetailsHotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_hotel);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Detalle");
        setSupportActionBar(toolbar);


        if(savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            DetailsHotelImageFragment detailsHotelImageFragment = new DetailsHotelImageFragment();
            fragmentTransaction.add(R.id.detailsHotelActivity, detailsHotelImageFragment);
            fragmentTransaction.commit();
        }
    }
}
