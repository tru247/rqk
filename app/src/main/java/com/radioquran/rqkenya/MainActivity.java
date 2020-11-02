package com.radioquran.rqkenya;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Context activityContext;

    JcPlayerView jcplayerView;
    ArrayList<JcAudio> jcAudios = new ArrayList<>();

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        //myWebView.loadUrl("https://radioqurankenya.co.ke");
        myWebView.loadUrl("https://radioqurankenya.co.ke/radio/live");

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Set up the music player
        //jcplayerView = (JcPlayerView) findViewById(R.id.jcplayer);
        //init the playlist using an arrayList
        //jcAudios.add(JcAudio.createFromURL("Recitation 1","https://radioqurankenya.co.ke/uploads/1f7f4128941e9005c4c6e1efbcda8db7.mp3"));
        //jcAudios.add(JcAudio.createFromURL("Recitation 2","https://radioqurankenya.co.ke/uploads/b2db0ee482d892140110d7bd02458e96.mp3"));
        //Fire Audio Player!!
        //jcplayerView.initPlaylist(jcAudios, null);
        //Set notification
        //jcplayerView.createNotification(R.drawable.logo); // Your icon resource

        //Set up the list and pass into the list an array of audio items
        
    }
}