package com.example.magician.lab2md;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.*;

public class SecondOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_one);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SecondOne.this, MainActivity.class);
                startActivity(intent);
            }

        });



    }
}
