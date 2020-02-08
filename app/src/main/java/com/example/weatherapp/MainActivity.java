package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weatherapp.Model.OpenWeatherMap;

public class MainActivity extends AppCompatActivity implements LocationListener {

    TextView txtCity, txtLastUpdate, txtDescription, txtHumidity, txtTime, txtCelsius;
    ImageView imageView;

    LocationManager locationManager;
    String provider;
    static double lat, lon;
    OpenWeatherMap openWeatherMap = new OpenWeatherMap();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
