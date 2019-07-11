package com.example.alc4phase1challenge_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button mAboutAlc;
    private Button mMyProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().setTitle(R.string.welcome_toolbar_text);
        mAboutAlc = findViewById(R.id.about_alc);
        mMyProfile = findViewById(R.id.profile);

        mAboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutActivityIntent = new Intent(WelcomeActivity.this, AboutALCActivity.class);
                startActivity(aboutActivityIntent);
            }
        });

        mMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myProfileActivityIntent = new Intent(WelcomeActivity.this, ProfileActivity.class);
                startActivity(myProfileActivityIntent);
            }
        });
    }
}
