package com.example.myapplication13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private Button button;


    public static final String EXTRA_TEXT = "com.example.myapplication13.EXTRA_TEXT";
    public static final String EXTRA_TEXT2 = "com.example.myapplication13.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3 = "com.example.myapplication13.EXTRA_TEXT3";
    public static final String EXTRA_TEXT4 = "com.example.myapplication13.EXTRA_TEXT4";
    public static final String EXTRA_TEXT5 = "com.example.myapplication13.EXTRA_TEXT5";
    public static final String EXTRA_TEXT6 = "com.example.myapplication13.EXTRA_TEXT6";

    public static EditText mEditText1;
    public static EditText mEditText3;
    public static EditText mEditText4;
    public static EditText mEditText5;
    public static EditText mEditText6;
    public static EditText mEditText7;
    public static TextView mTextView1;
    public static TextView mTextView3;
    public static TextView mTextView4;
    public static TextView mTextView5;
    public static TextView mTextView6;
    public static TextView mTextView7;


    public MainActivity() {
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                openTela2();
            }
        });

       mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText3 = (EditText) findViewById(R.id.editText3);
        mEditText4 = (EditText) findViewById(R.id.editText4);
        mEditText5 = (EditText) findViewById(R.id.editText5);
        mEditText6 = (EditText) findViewById(R.id.editText6);
        mEditText7 = (EditText) findViewById(R.id.editText7);
        mTextView1 = (TextView) findViewById(R.id.textView1);
        mTextView3 = (TextView) findViewById(R.id.textView3);
        mTextView4 = (TextView) findViewById(R.id.textView4);
        mTextView5 = (TextView) findViewById(R.id.textView5);
        mTextView6 = (TextView) findViewById(R.id.textView6);
        mTextView7 = (TextView) findViewById(R.id.textView7);

    }

    public void openTela2(){


        mEditText1 = (EditText) findViewById(R.id.editText1);
        String text = mEditText1.getText().toString();

      mEditText3 = (EditText) findViewById(R.id.editText3);
        String text2 = mEditText3.getText().toString();

        mEditText4 = (EditText) findViewById(R.id.editText4);
        String text3 = mEditText4.getText().toString();

        mEditText5 = (EditText) findViewById(R.id.editText5);
        String text4 = mEditText5.getText().toString();

        mEditText6 = (EditText) findViewById(R.id.editText6);
        String text5 = mEditText6.getText().toString();

        mEditText7 = (EditText) findViewById(R.id.editText7);
        String text6 = mEditText7.getText().toString();

        Intent intent = new Intent(this, tela2.class);
        intent.putExtra(EXTRA_TEXT, text);

        intent.putExtra(EXTRA_TEXT2, text2);
        intent.putExtra(EXTRA_TEXT3, text3);
        intent.putExtra(EXTRA_TEXT4, text4);
        intent.putExtra(EXTRA_TEXT5, text5);
        intent.putExtra(EXTRA_TEXT6, text6);


        startActivity(intent);





    }


}

