package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("WeatherActivity", "onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("WeatherActivity", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("WeatherActivity", "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i("WeatherActivity", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "onDestroy");
    }
}