package com.example.admin.pineapple.view;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.example.admin.pineapple.R;
import com.example.admin.pineapple.applevel.AppPineapple;
import com.example.admin.pineapple.databinding.ActivityMapsBinding;
import com.example.admin.pineapple.model.Result;
import com.example.admin.pineapple.viewmodel.ViewModelRecycler;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.inject.Inject;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,Observer {

    private GoogleMap mMap;
    Double latitude, longitude;
    LocationManager locationManager;
    LocationListener locationListener;
    LatLng atlanta;
    Marker [] markers;
    private List<Result> locations;

    @Inject
    ViewModelRecycler vModel;

    ActivityMapsBinding mapsActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mapsActivityBinding = DataBindingUtil.setContentView(this,R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        ((AppPineapple) this.getApplicationContext()).getAppComponent().inject(this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == 1){
            if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

                if(ContextCompat.checkSelfPermission
                        (this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locationListener);

                }

            }
        }

    }


    public void userLocation(){

        locationManager = (LocationManager)this.getSystemService(Context.LOCATION_SERVICE);

        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

                latitude = location.getLatitude();
                longitude = location.getLongitude();
                String coordinates = latitude+","+longitude;

                vModel.fetchObservableEvents(coordinates);


                atlanta = new LatLng(latitude,longitude);

                // Add a marker in Sydney and move the camera
                mMap.addMarker(new MarkerOptions()
                        .position(atlanta)
                        .title("Your location"))
                        .setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(atlanta,8));

                 String latlong = latitude+","+longitude;
                vModel.fetchObservableEvents(latlong);

                 locations = vModel.getResults();
                 markers = new Marker[locations.size()];
                 LatLng []atl = new LatLng[locations.size()];

                for (int i = 0; i<locations.size(); i++) { //33.7,-94

                    atl[i] = new LatLng(Double.parseDouble(locations.get(i).getPlace().getGeoPoint().getLat())
                                       ,Double.parseDouble(locations.get(i).getPlace().getGeoPoint().getLon()));

                    markers[i] = mMap.addMarker(new MarkerOptions()
                        .position(atl[i]));

                    markers[i].setVisible(true);

                }

                Log.i("Location",location.toString());
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }

        };

        //sdk version >= 23 version
        if(Build.VERSION.SDK_INT >= 23){

            if(ContextCompat.checkSelfPermission
                    (this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){

                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);

            }
            else{
                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locationListener);
            }

        }
        else{

            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,5,0,locationListener);
        }

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {

        userLocation();

        mMap = googleMap;
        //Setmap type
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        /*
        LatLng sydney = new LatLng();
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        */
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
