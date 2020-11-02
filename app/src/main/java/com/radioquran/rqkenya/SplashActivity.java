package com.radioquran.rqkenya;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

//public class SplashActivity extends AppCompatActivity {
public class SplashActivity extends Activity {

    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        setContentView(R.layout.activity_splash);
    //    }
    Context context;

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.splashfile);
        setContentView(R.layout.activity_splash);

        //Setup the piccasso image settings...
        String imageUri = "https://radioqurankenya.co.ke/assets/cdn/images/RQFM_outlined.png";
        //ImageView ivBasicImage = (ImageView) findViewById(R.id.ivBasicImage);
        ImageView logoImg = (ImageView) findViewById(R.id.logo_id);
        Picasso.with(context).load(imageUri).into(logoImg);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },8000);

    }
}