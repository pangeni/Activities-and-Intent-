package com.example.intentandactivities;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

=======
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView text_count;
>>>>>>> Activity_Homework
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
<<<<<<< HEAD

        Intent intent=getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }

}
=======
        text_count = findViewById(R.id.view_count);


        Intent intent=getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        text_count.setText(msg);
    }


}
>>>>>>> Activity_Homework
