package com.example.currentplacedetailsonmap;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity{
    Runnable mRunnable=   new Runnable() {
        @Override
        public void run() {

            startActivity(new Intent(SplashScreen.this, MapsActivityCurrentPlace.class));

            finish();
        }
    };
    Handler mHandler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        mHandler .postDelayed(mRunnable,4000);

    }



    @Override
    protected void onPause() {
        super.onPause();
        mHandler.removeCallbacks(mRunnable);
    }
    @Override
    protected void onResume() {
        super.onResume();
        // mHandler.removeCallbacks(mRunnable);
        //mHandler.postDelayed(mRunnable,1000);
    }

}
