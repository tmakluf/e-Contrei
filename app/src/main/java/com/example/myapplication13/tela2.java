package com.example.myapplication13;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import androidx.appcompat.app.AppCompatActivity;


public class tela2 extends AppCompatActivity {

    private Button button2;

    public static final String  EXTRA_TEXT7 = "com.example.myapplication13.EXTRA_TEXT7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                openTela3();
            }
        });

      /* MainActivity.mEditText4 = (EditText) findViewById(R.id.editText4);
       MainActivity.mTextView4 = (TextView) findViewById(R.id.textView4);*/

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        String text2 = intent.getStringExtra(MainActivity.EXTRA_TEXT2);
        String text3 = intent.getStringExtra(MainActivity.EXTRA_TEXT3);
        String text4 = intent.getStringExtra(MainActivity.EXTRA_TEXT4);
        String text5 = intent.getStringExtra(MainActivity.EXTRA_TEXT5);
        String text6 = intent.getStringExtra(MainActivity.EXTRA_TEXT6);


        TextView textView01 = (TextView) findViewById(R.id.textView01);
        TextView textView03 = (TextView) findViewById(R.id.textView03);
        TextView textView04 = (TextView) findViewById(R.id.textView04);
        TextView textView05 = (TextView) findViewById(R.id.textView05);

        TextView textViewStart = (TextView) findViewById(R.id.textViewStart);


        textView01.setText("Empresa: "+ text.toUpperCase());
        textView04.setText("Nome: " + text3.toUpperCase());
        textView03.setText("Clínica: " +text2.toUpperCase());


        textViewStart.setText("Ok, " +text3 +"!\n"+" Agora conte o que achou do nosso atendimento.");

}


    public void openTela3(){

        Intent intent = getIntent();

       String text3 = intent.getStringExtra(MainActivity.EXTRA_TEXT3);
       String text7 = text3.toString();

     //  TextView textView04 = (TextView) findViewById(R.id.textView04);
      // String text7 = textView04.getText().toString();



        intent = new Intent(this, tela3.class);
        intent.putExtra(EXTRA_TEXT7, text7);

        startActivity(intent);

} }