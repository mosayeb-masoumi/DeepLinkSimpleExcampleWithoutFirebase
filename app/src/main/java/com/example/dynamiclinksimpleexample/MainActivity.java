package com.example.dynamiclinksimpleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Uri uri = getIntent().getData();
         if(uri!=null){
             List<String> params = uri.getPathSegments();
             String id = params.get(params.size() - 1); // to get the last param
             Toast.makeText(this, ""+id, Toast.LENGTH_SHORT).show();
         }


         // source youtube movie https://www.youtube.com/watch?v=FRRIuU83rt0

         // the link that we should click is https://www.viralcode.com/vi/1234


        // we dont need to set our app in to firebase in this case
    }
}