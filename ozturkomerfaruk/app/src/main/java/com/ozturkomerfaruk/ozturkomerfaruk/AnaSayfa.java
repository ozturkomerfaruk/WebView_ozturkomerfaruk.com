package com.ozturkomerfaruk.ozturkomerfaruk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AnaSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana_sayfa);

        WebView wvozturkomerfaruk = (WebView) findViewById(R.id.wvozturkomerfaruk);
        wvozturkomerfaruk.getSettings().setJavaScriptEnabled(true);
        wvozturkomerfaruk.setWebViewClient(new WebViewClient());
        wvozturkomerfaruk.loadUrl("https://ozturkomerfaruk.com/");
    }
}