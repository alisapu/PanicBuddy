package com.mucsc2450.alisa.panicbuddy;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;

import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;

import android.util.Log;
import android.view.Menu;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contact extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;

    private String phoneNo, message, username;
    private Button mSendButton, mCancelButton;
    private EditText mNameEdit, mPhoneEdit, mMessageEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        mCancelButton = (Button) findViewById(R.id.cancel_button);
        mSendButton = (Button) findViewById(R.id.send_button);

        mNameEdit = (EditText) findViewById(R.id.contactName);
        mMessageEdit = (EditText) findViewById(R.id.contactMessage);
        mPhoneEdit = (EditText) findViewById(R.id.contactPhone);


        mMessageEdit.setText("Hi. " + getString(R.string.default_text));

        mSendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("smsto:" + mPhoneEdit.getText().toString());
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.putExtra("sms_body", mMessageEdit.getText().toString());
                startActivity(i);
            }
        });

        mCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }



//    public void sendSMSMessage() {
//        phoneNo = mPhoneEdit.getText().toString();
//        message = mMessageEdit.getText().toString();
//
//        if (ContextCompat.checkSelfPermission(this,
//                Manifest.permission.SEND_SMS)
//                != PackageManager.PERMISSION_GRANTED) {
//                    if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                        Manifest.permission.SEND_SMS)) {
//                    } else {
//                        ActivityCompat.requestPermissions(this,
//                            new String[]{Manifest.permission.SEND_SMS},
//                            MY_PERMISSIONS_REQUEST_SEND_SMS);
//            }
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
//        switch (requestCode) {
//            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
//                if (grantResults.length > 0
//                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                            SmsManager smsManager = SmsManager.getDefault();
//                            smsManager.sendTextMessage(phoneNo, null, message, null, null);
//                            Toast.makeText(getApplicationContext(), "SMS sent.",
//                                Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(),
//                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
//                    return;
//                }
//            }
//        }

    }



