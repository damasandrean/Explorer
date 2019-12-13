package com.damasandrean.explorer.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.damasandrean.explorer.R;
import com.damasandrean.explorer.activities.DetailActivity;


public class MenuFragment extends Fragment {
    TextView judul1, judul2, judul3, judul4, judul5, judul6, judul7, judul8;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        judul1 = view.findViewById(R.id.judul1);
        judul2 = view.findViewById(R.id.judul2);
        judul3 = view.findViewById(R.id.judul3);
        judul4 = view.findViewById(R.id.judul4);
        judul5 = view.findViewById(R.id.judul5);
        judul6 = view.findViewById(R.id.judul6);
        judul7 = view.findViewById(R.id.judul7);
        judul8 = view.findViewById(R.id.judul8);

        judul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("title", "Hotel Singhasari");
                i.putExtra("desc", "Jl. Ir. Soekarno No.120, Beji, Kec. Batu, Kota Batu, Jawa Timur 65236");
                startActivity(i);
            }
        });
        judul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("title", "Hotel Grand City");
                i.putExtra("desc", "Jl. Bukit Berbunga No.104-108, Sidomulyo, Kec. Batu, Kota Batu, Jawa Timur 65317");
                startActivity(i);
            }
        });
        judul3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("title", "Hotel Kartika");
                i.putExtra("desc", "Hotel Kartika juga menyediakan layanan dan fasilitas lain seperti VIP Karaoke," +
                        " Bamboo Coffee Shop, Cake Shop, Parkway Health, Swimming Pool, " +
                        " VIP Azelia Meeting Room, Laundry, Swarna Paksi Ballroom, " +
                        "Taxi Service, Rental Mobil " +
                        " Jl. Jaksa Agung Soeprapto 17, Malang");
                startActivity(i);
            }
        });
        judul4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("title", "Wisata Batu Flower Garden");
                i.putExtra("desc", "Objek wisata ini memiliki pemandangan sisi bukit dengan bunga, air terjun, dan berbagai aktivitas.\n" +
                        "Alamat: Oro-Oro Ombo, Kehutanan, Kec. Batu, Kota Batu, Jawa Timur 65151");
                startActivity(i);
            }
        });
        judul5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("title", "Wisata Paralayang Batu");
                i.putExtra("desc", "Kota Batu yang memiliki ketinggian 1.326 mdpl. Tempat ini pada mulanya merupakan tempat yang dijadikan sebagai landasan take-off atlet paralayang.\n" +
                        "\n" +
                        "Lokasi ini dijadikan pusat latihan dan event paralayang se-Malang Raya. Diresmikan pada tahun 2000, bersamaan dengan diadakannya event PON VI Jatim " +

                        "Paralayang secara geografis terletak di Desa Songgokerto, Kecamatan Batu, Kota Batu, Jawa Timur.\n" +
                        "\n" +
                        "Kawasan ini berbatasan dengan Kecamatan Pujon yang merupakan lokasi bagi salah satu air terjun indah di Batu, Coban Rondo");
                startActivity(i);
            }
        });
        return view;
    }
}
