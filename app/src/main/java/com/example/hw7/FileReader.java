package com.example.hw7;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class FileReader {

    private String firstName, lastName, status;

    public void fileReader(){

    }

//    public void getData(){
//        String json = null;
//        try {
//            InputStream is = MainActivity.getAssets().open("user.json");
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//            json = new String(buffer, "UTF-8");
//        } catch (
//                IOException ex) {
//            ex.printStackTrace();
//        }
//
//        try {
//            JSONObject obj = new JSONObject(json);
//            JSONObject user = obj.getJSONObject("user");
//            status = user.getString();
//
//        } catch (
//                JSONException e){
//            e.printStackTrace();
//        }
//        Log.d("myTag", json);
//    }

    public String getStatus(){

        return this.status;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }


}
