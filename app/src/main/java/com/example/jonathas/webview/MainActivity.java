package com.example.jonathas.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.webView1);

        //receber a entidade de configuração
        WebSettings ws = wv.getSettings();

        //setar valores JavaScript e Zoom;
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        //acessar a URL
        wv.loadUrl("http://www.betaetiquetas.com.br/product_images/y/643/teste1__63139_zoom.png");

        //para montar html/javascript, string html + wv.loadData(html);


    }
}
