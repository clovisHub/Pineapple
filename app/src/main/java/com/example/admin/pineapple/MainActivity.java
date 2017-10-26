package com.example.admin.pineapple;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.admin.pineapple.view.MapsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnGo;


    Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo = (Button) findViewById(R.id.btn_goId);
        btnGo.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }


}
