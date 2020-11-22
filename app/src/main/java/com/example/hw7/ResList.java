package com.example.hw7;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ResList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.resources_activity);
        ImageView img1 = (ImageView) findViewById(R.id.img1);
        Glide.with(this).asGif().load(Uri.parse("file:///android_asset/Bear-Hug.gif")).into(img1);
        TextView txt1 = (TextView) findViewById(R.id.title1);
        txt1.setText("Bear Hug");

        ImageView img2 = (ImageView) findViewById(R.id.img2);
        Glide.with(this).asGif().load(Uri.parse("file:///android_asset/Shoulder-Roll.gif")).into(img2);
        TextView txt2 = (TextView) findViewById(R.id.title1);
        txt2.setText("Shoulder Roll");

        ImageView img3 = (ImageView) findViewById(R.id.img3);
        Glide.with(this).asGif().load(Uri.parse("file:///android_asset/Hip-Stretch.gif")).into(img3);
        TextView txt3 = (TextView) findViewById(R.id.title1);
        txt3.setText("Hip Stretch");

        ImageView img4 = (ImageView) findViewById(R.id.img4);
        Glide.with(this).asGif().load(Uri.parse("file:///android_asset/Neck-Stretch.gif")).into(img4);
        TextView txt4 = (TextView) findViewById(R.id.title1);
        txt4.setText("Neck Stretch");

        ImageView img5 = (ImageView) findViewById(R.id.img5);
        Glide.with(this).asGif().load(Uri.parse("file:///android_asset/Seated-spinal-twist.gif")).into(img5);
        TextView txt5 = (TextView) findViewById(R.id.title1);
        txt5.setText("Seated-Spinal-Twist");

        ImageView img6 = (ImageView) findViewById(R.id.img6);
        Glide.with(this).asGif().load(Uri.parse("file:///android_asset/Shoulder-Stretch-across-Chest.gif")).into(img6);
        TextView txt6 = (TextView) findViewById(R.id.title1);
        txt6.setText("Shoulder-Stretch-across-Chest");

        ImageView img7 = (ImageView) findViewById(R.id.img7);
        Glide.with(this).asGif().load(Uri.parse("file:///android_asset/Tricep-stretch-behind-head.gif")).into(img7);
        TextView txt7 = (TextView) findViewById(R.id.title1);
        txt7.setText("Tricep-Stretch-Behind-Head");
    }
}
