package com.example.wee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    WebView web = (WebView) findViewById(R.id.web_view);
    web.loadUrl("http://185.63.253.200/");
    WebSettings webSettings = web.getSettings();
    webSettings.setJavaScriptEnabled(true);
    web.setWebViewClient(new WebViewClient());

}
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            WebView web = (WebView) findViewById(R.id.web_view);
            web.loadUrl("http://185.63.253.200/");
            web.setWebViewClient(new WebViewClient());
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
}