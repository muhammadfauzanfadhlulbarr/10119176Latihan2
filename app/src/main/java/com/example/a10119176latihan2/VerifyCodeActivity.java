package com.example.a10119176latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

// Muhammad Fauzan Fadhlulbarr | 07 Mei 2022 | 10119176 | IF10k
public class VerifyCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);
        getSupportActionBar().hide();
    }

    public void send (View view){
        Intent intent = new Intent(this, com.example.a10119176latihan2.ProfileActivity.class);
        startActivity(intent);
    }
}