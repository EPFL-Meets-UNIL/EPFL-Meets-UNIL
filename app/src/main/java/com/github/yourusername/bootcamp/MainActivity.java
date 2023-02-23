package com.github.yourusername.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        // Do something in response to button click
        Intent myIntent = new Intent(MainActivity.this, GreetingActivity.class);
        myIntent.putExtra("message", get_text());
        MainActivity.this.startActivity(myIntent);
    }
    public String get_text(){
        //Get test from text field

        TextView textView = findViewById(R.id.mainTextField);

        return textView.getText().toString();





    }
}