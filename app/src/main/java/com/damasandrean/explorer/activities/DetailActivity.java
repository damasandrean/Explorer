package com.damasandrean.explorer.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.damasandrean.explorer.R;

public class DetailActivity extends AppCompatActivity {
    TextView title,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        title = findViewById(R.id.title);
        desc = findViewById(R.id.desc);
        title.setText(getIntent().getExtras().getString("title"));
        desc.setText(getIntent().getExtras().getString("desc"));
    }
}
