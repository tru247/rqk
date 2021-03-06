package com.radioquran.rqkenya;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.flarebit.flarebarlib.FlareBar;
import com.flarebit.flarebarlib.Flaretab;
import com.flarebit.flarebarlib.TabEventObject;

import java.util.ArrayList;

public class RecitationsActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recitations);

        WebView myWebView = (WebView) findViewById(R.id.recitationsWebview);
        myWebView.loadUrl("https://radioqurankenya.co.ke/app/recitations");

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        final FlareBar bottomBar = findViewById(R.id.bottomBar);
        bottomBar.setBarBackgroundColor(Color.parseColor("#bf5b05"));
        ArrayList<Flaretab> tabs = new ArrayList<>();
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.badge_round_bg),"Recitations","#B39DDB"));
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.ic_arrow_forward_white),"Home","#FFECB3"));
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.avatar),"About","#80DEEA"));
        tabs.add(new Flaretab(getResources().getDrawable(R.drawable.phoneb),"Contact","#EF9A9A"));
        //tabs.add(new Flaretab(getResources().getDrawable(R.drawable.settingsb),"Settings","#B2DFDB"));

        bottomBar.setTabList(tabs);
        bottomBar.attachTabs(RecitationsActivity.this);

        bottomBar.setTabChangedListener(new TabEventObject.TabChangedListener() {
            @Override
            public void onTabChanged(LinearLayout selectedTab, int selectedIndex, int oldIndex) {
                //tabIndex starts from 0 (zero). Example : 4 tabs = last Index - 3
                //Toast.makeText(MainActivity.this,"Tab "+ selectedIndex+" Selected.",Toast.LENGTH_SHORT).show();
                if(selectedIndex == 0){
                    //Go to home activity
                    Intent intent = new Intent(RecitationsActivity.this, RecitationsActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                else if(selectedIndex == 1){
                    //Go to About us activity
                    Intent intent = new Intent(RecitationsActivity.this, MainActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                else if(selectedIndex == 2){
                    //Go to Radio page
                    Intent intent = new Intent(RecitationsActivity.this, AboutActivity.class);
                    //EditText editText = (EditText) findViewById(R.id.editText);
                    //String message = editText.getText().toString();
                    //intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
                else if(selectedIndex == 3){
                    //Go to Contact us page
                    Intent intent = new Intent(RecitationsActivity.this, ContactActivity.class);
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