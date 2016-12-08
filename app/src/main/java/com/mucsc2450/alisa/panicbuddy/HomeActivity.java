package com.mucsc2450.alisa.panicbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView mWelcomeText, mWelcomeMessage;
    private String EXTRA_name, EXTRA_welcome;
    private Button mstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        EXTRA_welcome = getIntent().getExtras().getString("welcome");
        EXTRA_name = getIntent().getExtras().getString("name");
        mWelcomeText = (TextView)findViewById(R.id.welcome_text);
        mWelcomeText.setText(EXTRA_welcome + " " + EXTRA_name);
        mWelcomeMessage = (TextView) findViewById(R.id.welcome_message);
        mWelcomeMessage.setText("This is Panic Buddy, an app that\n" +
                "helps users get support with their\n" +
                "anxiety attacks by allowing them to\n" +
                "create an easily accessible support system");
        mstart = (Button) findViewById(R.id.start);

        mstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Home2Activity.class);
                i.putExtra("name1", EXTRA_name);
                startActivity(i);
            }

    });
}}


