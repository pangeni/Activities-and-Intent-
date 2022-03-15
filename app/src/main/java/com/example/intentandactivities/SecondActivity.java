package com.example.intentandactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView text_1 ;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text_1 = findViewById(R.id.textView);
        // Put that message into the text_message TextView
        Intent intent=getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        if(msg.equals("text_one")){
            text_1.setText(R.string.article1);
        }else if(msg.equals("text_two")){
            text_1.setText(R.string.article2);
        }else if(msg.equals("text_three")){
            text_1.setText(R.string.article3);
        }
    }
}