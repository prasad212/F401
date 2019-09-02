package com.example.f401;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Messaging extends AppCompatActivity {
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);
        textView1=(TextView)findViewById(R.id.text1);
        textView1.setText("hello");
    }
}
