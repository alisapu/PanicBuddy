package com.mucsc2450.alisa.panicbuddy;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class sleepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        VideoView videoView =(VideoView)findViewById(R.id.videoView2);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri= Uri.parse("rtsp://r5---sn-vgqs7nez.googlevideo.com/Cj0LENy73wIaNAkjg4SJGdww8RMYDSANFC2fRj9YMOCoAUIASARg2JDu7ObRu-VUigELQmM3QTVDRVBHMXcM/38BAF81518E1542E0A7082C09B92F68A5A007796.3F66692A071F4C0291076CC7D62DE9851787360D/yt6/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}
