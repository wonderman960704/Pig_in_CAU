package com.healer.pigincau;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Runnable mRunnable;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRunnable = new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),tableActivity.class);
                startActivity(intent);
            }
        };
        mHandler = new Handler();
        mHandler.postDelayed(mRunnable, 1000);
    }

    protected void onDestroy(){
        mHandler.removeCallbacks(mRunnable);
        super.onDestroy();
    }
}
