package com.damasandrean.explorer.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.damasandrean.explorer.R;
import com.damasandrean.explorer.activities.FacebookActivity;
import com.damasandrean.explorer.activities.LoginActivity;
import com.damasandrean.explorer.activities.RegisterActivity;
import com.damasandrean.explorer.activities.WhatsappActivity;


public class UserFragment extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view  = inflater.inflate(R.layout.fragment_user, container, false);

        Button firebase = (Button) view.findViewById(R.id.firebase);
        firebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), RegisterActivity.class );
                startActivity(in);
            }
        });

        Button whatsapp = (Button) view.findViewById(R.id.whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), WhatsappActivity.class );
                startActivity(in);
            }
        });

        Button facebook = (Button) view.findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), FacebookActivity.class );
                startActivity(in);
            }
        });

        Button logout = (Button) view.findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), LoginActivity.class );
                startActivity(in);
            }
        });

        return view;
    }

}
