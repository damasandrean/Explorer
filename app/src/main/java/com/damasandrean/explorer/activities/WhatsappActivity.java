package com.damasandrean.explorer.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.damasandrean.explorer.R;

public class WhatsappActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);

    }
    public void bukaWA(View v) {
        Intent i = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        startActivity(i);
    }

}