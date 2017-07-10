package com.example.mehmet.myfirstapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DisplayMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng Probel = new LatLng(38.426319, 27.139560);
        mMap.addMarker(new MarkerOptions().position(Probel).title("PROBEL"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Probel));
        float zoomLevel = (float) 18.0; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Probel, zoomLevel));
    }

}