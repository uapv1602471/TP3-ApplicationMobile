package com.example.uapv1602471.tp3;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

//import fr.uavignon.shuet.tp3.data.City;
//import fr.uavignon.shuet.tp3.webservice.JSONResponseHandler;
//import fr.uavignon.shuet.tp3.webservice.WebServiceUrl;

public class CityActivity extends AppCompatActivity {

    private static final String TAG = CityActivity.class.getSimpleName();
    private TextView textCityName, textCountry, textTemperature, textHumdity, textWind, textCloudiness, textLastUpdate;
    private ImageView imageWeatherCondition;
    private City city;
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        city = (City) getIntent().getParcelableExtra(City.TAG);

        textCityName = (TextView) findViewById(R.id.nameCity);
        textCountry = (TextView) findViewById(R.id.country);
        textTemperature = (TextView) findViewById(R.id.editTemperature);
        textHumdity = (TextView) findViewById(R.id.editHumidity);
        textWind = (TextView) findViewById(R.id.editWind);
        textCloudiness = (TextView) findViewById(R.id.editCloudiness);
        textLastUpdate = (TextView) findViewById(R.id.editLastUpdate);

        imageWeatherCondition = (ImageView) findViewById(R.id.imageView);

        updateView();

        final Button but = (Button) findViewById(R.id.button);

        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            // TODO

            }
        });

    }

    @Override
    public void onBackPressed() {
        //TODO : prepare result for the main activity
        super.onBackPressed();
    }

    private void updateView() {

        textCityName.setText(city.getName());
        textCountry.setText(city.getCountry());
        textTemperature.setText(city.getTemperature()+" °C");
        textHumdity.setText(city.getHumidity()+" %");
        textWind.setText(city.getFullWind());
        textCloudiness.setText(city.getHumidity()+" %");
        textLastUpdate.setText(city.getLastUpdate());

        if (city.getIcon()!=null && !city.getIcon().isEmpty()) {
            Log.d(TAG,"icon="+"icon_" + city.getIcon());
            imageWeatherCondition.setImageDrawable(getResources().getDrawable(getResources()
                    .getIdentifier("@drawable/"+"icon_" + city.getIcon(), null, getPackageName())));
            imageWeatherCondition.setContentDescription(city.getDescription());
        }

    }

*/
   
}
