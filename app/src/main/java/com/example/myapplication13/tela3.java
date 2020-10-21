package com.example.myapplication13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class tela3 extends AppCompatActivity {

    Timer timer2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);


        Intent intent = getIntent();
        String text7 = intent.getStringExtra(tela2.EXTRA_TEXT7);

        TextView textViewFinal = (TextView) findViewById(R.id.textViewFinal);

        textViewFinal.setText("Obrigado pelo seu feedback,\n" +text7 +"!");


        timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(tela3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);

    }





}
