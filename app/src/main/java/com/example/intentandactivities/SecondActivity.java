package com.example.intentandactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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


        if(msg.equals("article1")){
            text_1.setText(R.string.a1);
        }else if(msg.equals("article2")){
            text_1.setText(R.string.a2);
        }else if(msg.equals("article3")){
            text_1.setText(R.string.a3);
        }
    }
}
