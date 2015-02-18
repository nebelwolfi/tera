package tera.nebelwolfi.tera.main.web;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import tera.nebelwolfi.tera.R;

/**
 * Created by Nebelwolfi on 18.02.2015.
 */
public class WebViewActivity extends Activity {

    private WebView webview;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webview = (WebView) findViewById(R.id.webView1);
        webview.getSettings().setJavaScriptEnabled(true);
        // old idea: iframe of http://en.tera.gameforge.com/news/morenews/1
        // String customHtml = "<html><body><div style='border: 0px solid rgb(201, 0, 1); overflow: hidden; margin: 0px auto; max-width: 550px;'><iframe scrolling='no' src='http://en.tera.gameforge.com/news/morenews/1' style='border: 0px none; margin-left: 0px; height: 1600px; margin-top: -650px; width: 550px;'></iframe></div></body></html>";
        // webview.loadData(customHtml, "text/html", "UTF-8");
        // instead calling launcher embedded page and enforcing landscape:
        webview.loadUrl("http://en.tera.gameforge.com/launcher");
    }

}