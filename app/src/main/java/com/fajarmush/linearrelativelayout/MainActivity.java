package com.fajarmush.linearrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveRelative(View view) {
        setContentView(R.layout.relative_page);
    }

    public void moveMain(View view) {
        setContentView(R.layout.activity_main);
    }
}