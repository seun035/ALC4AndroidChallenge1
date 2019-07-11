package com.example.alc4phase1challenge_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutALCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        getSupportActionBar().setTitle(R.string.about_alc_toolbar_text);
    }
}
