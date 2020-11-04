package com.example.wee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        WebView web = (WebView) findViewById(R.id.web_view);
        web.loadUrl("http://youtube.com/");
        web.setWebViewClient(new WebViewClient());
    }
}