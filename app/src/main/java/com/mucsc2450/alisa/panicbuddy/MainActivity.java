package com.mucsc2450.alisa.panicbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mBegin;
    private EditText musername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBegin = (Button) findViewById(R.id.start_button);
        musername = (EditText) findViewById(R.id.username);

        mBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("welcome", getString(R.string.greeting));
                i.putExtra("name", musername.getText().toString());
                startActivity(i);
            }
        });

    }
}
