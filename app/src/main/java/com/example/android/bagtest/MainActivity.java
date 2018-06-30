package com.example.android.bagtest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnA = (Button) findViewById(R.id.btnA);
        Button btnB = (Button) findViewById(R.id.btnB);
        Button btnC = (Button) findViewById(R.id.btnC);
        Button btnD = (Button) findViewById(R.id.btnD);
        final MediaPlayer mpA = MediaPlayer.create(this, R.raw.a);
        final MediaPlayer mpB = MediaPlayer.create(this, R.raw.b);
        final MediaPlayer mpC = MediaPlayer.create(this, R.raw.c);
        final MediaPlayer mpD = MediaPlayer.create(this, R.raw.d);
        btnA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                mpA.start();

            }
        });

        btnB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mpB.start();
            }
        });

        btnC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mpC.start();
            }
        });

        btnD.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mpD.start();
            }
        });
    }


}
