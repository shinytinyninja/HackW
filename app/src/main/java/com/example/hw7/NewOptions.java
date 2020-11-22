package com.example.hw7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.new_options);
    }

    public void engineer_clicked(){
        Intent i = new Intent();
        i.putExtra("Ex")
        startActivity(i);
    }

    public void art_student_clicked(){

    }
    public void med_sci_clicked(){

    }
    public void computer_clicked(){

    }
    public void poli_sci_clicked(){

    }

}
