package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    PagerAdapter pagerAdapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
//
//    final Handler handler = new Handler(Looper.getMainLooper()){
//        @Override
//        public void handleMessage(@NonNull Message msg) {
//            String content = msg.getData().getString("server_response");
//            Toast.makeText(getApplicationContext(),content,Toast.LENGTH_LONG).show();
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
//        Log.i("OnCreate","something");

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.demilovatocommanderinchief);
        mediaPlayer.start();

        //view pager
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tableLayout = findViewById(R.id.tabLayout);
        tableLayout.setupWithViewPager(viewPager);

//        if( savedInstanceState == null) {
//            WeatherAndForecastFragment weatherAndForecastFragment = new WeatherAndForecastFragment();
//            getSupportFragmentManager().beginTransaction().add(R.id.fragment_parent, weatherAndForecastFragment).commit();
//        }
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.i("OnStart", "something");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("OnResume", "something");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("OnPause", "something");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("OnStop", "something");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("OnDestroy", "something");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}