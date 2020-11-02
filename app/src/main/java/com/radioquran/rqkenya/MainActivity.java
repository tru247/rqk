package com.radioquran.rqkenya;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;
import com.flarebit.flarebarlib.FlareBar;
import com.flarebit.flarebarlib.Flaretab;
import com.flarebit.flarebarlib.TabEventObject;

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

        final FlareBar bottomBar = findViewById(R.id.bottomBar);
        bottomBar.setBarBackgroundColor(Color.parseColor("#bf5b05"));
        ArrayList<Flaretab> tabs = new ArrayList<>();
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.ic_arrow_forward_white),"Home","#FFECB3"));
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.avatar),"About","#80DEEA"));
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.badge_round_bg),"Recitations","#B39DDB"));
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.phoneb),"Contact","#EF9A9A"));
        //tabs.add(new Flaretab(getResources().getDrawable(R.drawable.settingsb),"Settings","#B2DFDB"));

        bottomBar.setTabList(tabs);
        bottomBar.attachTabs(MainActivity.this);

        bottomBar.setTabChangedListener(new TabEventObject.TabChangedListener() {
            @Override
            public void onTabChanged(LinearLayout selectedTab, int selectedIndex, int oldIndex) {
                //tabIndex starts from 0 (zero). Example : 4 tabs = last Index - 3
                //Toast.makeText(MainActivity.this,"Tab "+ selectedIndex+" Selected.",Toast.LENGTH_SHORT).show();
                if(selectedIndex == 0){
                    //Go to home activity
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                else if(selectedIndex == 1){
                    //Go to About us activity
                    Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                else if(selectedIndex == 2){
                    //Go to Radio page
                    Intent intent = new Intent(MainActivity.this, RecitationsActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                else if(selectedIndex == 3){
                    //Go to Contact us page
                    Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                //else if(selectedIndex == 4){
                    //Go to Settings page
                //}
            }
        });

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