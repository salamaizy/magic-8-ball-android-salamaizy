package com.londonappbrewery.magiceightball;

import android.app.Activity;
import android.support.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageAsk = (ImageView) findViewById(R.id.imageAsk);
        Button buttonAsk = (Button) findViewById(R.id.buttonAsk);
        final int[] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random numGen = new Random();
                int number = numGen.nextInt(5);

                imageAsk.setImageResource(ballArray[number]);
            }
        });

    }
}
