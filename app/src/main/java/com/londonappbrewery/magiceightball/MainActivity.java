package com.londonappbrewery.magiceightball;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int[] BALL_RESULTS = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball = findViewById(R.id.image_ball);
        final Button buttonAsk = findViewById(R.id.button_ask);

        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int res = getRandomBallResult();
                ball.setImageResource(res);
            }
        });
    }

    private int getRandomBallResult() {
        Random rng = new Random();
        return BALL_RESULTS[rng.nextInt(5)];
    }
}
