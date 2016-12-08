package com.mucsc2450.alisa.panicbuddy;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.VideoView;

public class RelaxActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl("http://youtube.com");


//        VideoView videoView =(VideoView)findViewById(R.id.videoView);
//        MediaController mediaController= new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        Uri vidUri= Uri.parse("rtsp://r4---sn-vgqsenlz.googlevideo.com/Cj0LENy73wIaNAlJ5PQHttvWWRMYDSANFC2nSz9YMOCoAUIASARg2JDu7ObRu-VUigELQmM3QTVDRVBHMXcM/AF7B2F97F85DB7C9662C1CAA4679E9CD93A65D9A.23192086D87A352FEE5C87E62C8708812E436413/yt6/1/video.3gp");
//        videoView.setMediaController(mediaController);
//        videoView.setVideoURI(vidUri);
//        videoView.requestFocus();
//        videoView.start();
    }
}
