package com.example.simpledicerollerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ImageView;
    Button Button;
    Random rah = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView = findViewById(R.id.image);
        Button = findViewById(R.id.button);


        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ra = rah.nextInt(5)+1;
                if (ra == 1){
                    ImageView.setImageResource(R.drawable.dice1);
                }
                if (ra == 2){
                    ImageView.setImageResource(R.drawable.dice2);
                }
                if (ra == 3){
                    ImageView.setImageResource(R.drawable.dice3);
                }
                if (ra == 4){
                    ImageView.setImageResource(R.drawable.dice4);
                }
                if (ra == 5){
                    ImageView.setImageResource(R.drawable.dice5);
                }

            }
        });
    }
}