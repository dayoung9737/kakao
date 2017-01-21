package com.hanbit.kakao.presentation.message;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.hanbit.kakao.R;

public class MessageWriteActivity extends AppCompatActivity {
    WebView mWebView;
WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_write);
    mWebView = (WebView) findViewById(R.id.mWebView);
        mWebSettings =mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
        mWebSettings.setUseWideViewPort(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.addJavascriptInterface(new JavascriptInterface2(this), "Hybrid");
        mWebView.loadUrl("file:///android_asset/www/message_write.html");


    }
}
