package com.example.mehmet.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }
    public void send_communication(View view) {
        Intent intent = new Intent(this, Communication.class);
        startActivity(intent);
    }
    public void send_services(View view) {
        Intent intent = new Intent(this, services.class);
        startActivity(intent);
    }
    public void send_reference(View view) {
        Intent intent = new Intent(this, reference.class);
        startActivity(intent);
    }
}