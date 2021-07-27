package com.example.birthdayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ename;
Button mbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename=(EditText)findViewById(R.id.name);
                mbutton=(Button)findViewById(R.id.create);
                mbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = ename.getText().toString();
                        if (name == null || name.equals("")) {
                            Toast.makeText(MainActivity.this, "No input", Toast.LENGTH_SHORT).show();
                        } else {
                            Intent ob = new Intent(MainActivity.this, birthday.class);
                            ob.putExtra("birthdayname",name);
                            MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.ring);
                            ring.start();


                            startActivity(ob);
                        }
                    }
                });
    }
}
