package com.example.android.buttonapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById (R.id.textView2);

        t1.setTextColor (Color.BLUE);
        t1.setBackgroundColor(Color.YELLOW);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("Ouch, you clicked me!");

                t1.setTextColor (Color.BLACK);
                t1.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
