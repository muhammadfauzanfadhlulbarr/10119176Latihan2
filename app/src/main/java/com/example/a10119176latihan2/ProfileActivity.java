package com.example.a10119176latihan2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

// Muhammad Fauzan Fadhlulbarr | 07 Mei 2022 | 10119176 | IF10k
public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();
    }
}