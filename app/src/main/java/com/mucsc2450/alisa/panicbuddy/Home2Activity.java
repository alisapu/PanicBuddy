package com.mucsc2450.alisa.panicbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home2Activity extends AppCompatActivity {

    private Button mSendMessage, mRelaxButton, mSleepButton, mvidButton;
    private String userName, relax, sleep, youvid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);


        mSendMessage = (Button) findViewById(R.id.contact_button);
        mRelaxButton = (Button) findViewById(R.id.calm_button);
        mSleepButton = (Button) findViewById(R.id.sleep_button);
        mvidButton = (Button) findViewById(R.id.vid_button);

        userName = getIntent().getExtras().getString("name1");


        mSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home2Activity.this, Contact.class);
                i.putExtra("name2", userName);
                startActivity(i);
            }
        });

        mRelaxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home2Activity.this, videoActivity.class);
                i.putExtra("web", "https://www.youtube.com/watch?v=Wdbbtgf05Ek");
                startActivity(i);
            }
        });

        mSleepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home2Activity.this, videoActivity.class);
                i.putExtra("web", "https://www.youtube.com/watch?v=8TDcGYmEgyM");
                startActivity(i);
            }
        });

        mvidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home2Activity.this, videoActivity.class);
                i.putExtra("web", "https://www.youtube.com");
                startActivity(i);
            }
        });


    }
}
