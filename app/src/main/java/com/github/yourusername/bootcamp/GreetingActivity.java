package com.github.yourusername.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        TextView textView = findViewById(R.id.greetingMessage);
        textView.setText("Hello " + getIntent().getStringExtra("message"));
    }


}