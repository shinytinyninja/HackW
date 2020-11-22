package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

//        FileReader file = new FileReader();
//        file.getData();
//        String status = file.getStatus();
//
//        if (status == "not_created"){
//
//        }else{
//
//        }
        Intent i = new Intent(this, ResList.class);
        startActivity(i);
    }
}