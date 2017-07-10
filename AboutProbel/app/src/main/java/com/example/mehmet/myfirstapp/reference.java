package com.example.mehmet.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class reference extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);
    }

    public void iaeh(View view) {
        Uri link = Uri.parse("http://www.iaeh.gov.tr/");
        Intent intent = new Intent(Intent.ACTION_VIEW, link);
        startActivity(intent);
    }
}
