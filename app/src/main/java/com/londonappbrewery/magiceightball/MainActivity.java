package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ask;
        ask = (Button) findViewById(R.id.askbutton);
        final ImageView ball = (ImageView) findViewById(R.id.ima_8ball);
        final int[] ballarray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball5,
                R.drawable.ball4
        };
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random test = new Random();
                int fix = test.nextInt(5);
                ball.setImageResource(ballarray[fix]);
            }
        });
    }
}
