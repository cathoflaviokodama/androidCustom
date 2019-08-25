package com.example.custom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CustomApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.webview);


        WebView myWebView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.addJavascriptInterface(this, "Android");

        Bundle b = getIntent().getExtras();
        String location = b.getString("location");
        myWebView.loadUrl(location);

    }
}
