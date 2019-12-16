package com.damasandrean.explorer.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.damasandrean.explorer.R;
import com.damasandrean.explorer.activities.BelanjaActivity;
import com.damasandrean.explorer.activities.HotelActivity;
import com.damasandrean.explorer.activities.KulinerActivity;
import com.damasandrean.explorer.activities.WhatsappActivity;
import com.damasandrean.explorer.activities.WisataActivity;


public class BerandaFragment extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view  = inflater.inflate(R.layout.fragment_beranda, container, false);

        CardView hotel =  view.findViewById(R.id.hotel);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), HotelActivity.class );
                startActivity(in);
            }
        });

        CardView wisata2 = view.findViewById(R.id.wisata2);
        wisata2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), WisataActivity.class );
                startActivity(in);
            }
        });

        CardView kuliner3 = view.findViewById(R.id.kuliner3);
        kuliner3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), KulinerActivity.class );
                startActivity(in);
            }
        });

        CardView belanja4 = view.findViewById(R.id.belanja4);
        belanja4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), BelanjaActivity.class );
                startActivity(in);
            }
        });

        return view;
    }

}
