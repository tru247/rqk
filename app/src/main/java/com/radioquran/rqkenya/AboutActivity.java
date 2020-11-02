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

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;
import com.flarebit.flarebarlib.FlareBar;
import com.flarebit.flarebarlib.Flaretab;
import com.flarebit.flarebarlib.TabEventObject;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView myWebView = (WebView) findViewById(R.id.aboutWebview);
        myWebView.loadUrl("https://radioqurankenya.co.ke/app/about");

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        final FlareBar bottomBar = findViewById(R.id.bottomBar);
        bottomBar.setBarBackgroundColor(Color.parseColor("#bf5b05"));
        ArrayList<Flaretab> tabs = new ArrayList<>();
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.avatar),"About","#80DEEA")); //0
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.ic_arrow_forward_white),"Home","#FFECB3")); //1
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.badge_round_bg),"Recitations","#B39DDB")); //2
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.phoneb),"Contact","#EF9A9A")); //3
        //tabs.add(new Flaretab(getResources().getDrawable(R.drawable.settingsb),"Settings","#B2DFDB"));

        bottomBar.setTabList(tabs);
        bottomBar.attachTabs(AboutActivity.this);

        bottomBar.setTabChangedListener(new TabEventObject.TabChangedListener() {
            @Override
            public void onTabChanged(LinearLayout selectedTab, int selectedIndex, int oldIndex) {
                //tabIndex starts from 0 (zero). Example : 4 tabs = last Index - 3
                //Toast.makeText(MainActivity.this,"Tab "+ selectedIndex+" Selected.",Toast.LENGTH_SHORT).show();
                if(selectedIndex == 0){
                    //Go to home activity
                    Intent intent = new Intent(AboutActivity.this, AboutActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                else if(selectedIndex == 1){
                    //Go to About us activity
                    Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                else if(selectedIndex == 2){
                    //Go to Radio page
                    Intent intent = new Intent(AboutActivity.this, RecitationsActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                else if(selectedIndex == 3){
                    //Go to Contact us page
                    Intent intent = new Intent(AboutActivity.this, ContactActivity.class);
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

    }
}