package com.example.birthdayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class birthday extends AppCompatActivity {
TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        mTextView=(TextView)findViewById(R.id.text);
        String val=getIntent().getStringExtra("birthdayname");
        mTextView.setText("Happy Birthday\n"+val);
    }
}