package com.example.contr.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    double a ;
    double b;
    int c;
    double ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final TextView editext1= findViewById(R.id.editText1);

        Button button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                editext1.append("1");
            }
        });
        Button button2= findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("2");

            }
        });
        Button button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("3");
            }
        });
        Button button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("4");
            }
        });
        Button button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("5");
            }
        });
        Button button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("6");
            }
        });
        Button button7=findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("7");
            }
        });
        Button button8=findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("8");
            }
        });
        Button button9=findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("9");
            }
        });
        Button button0=findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("0");
            }
        });
        Button buttondot=findViewById(R.id.buttondot);
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append(".");
            }
        });
        //final double a ;
        //double b;
        //double ans;
        Button buttonadd=findViewById(R.id.buttonadd);
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              a = Double.valueOf(editext1.getText().toString());
              editext1.setText("");
              c=1;
            }
        });
        Button buttonsub=findViewById(R.id.buttonsub);
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.valueOf(editext1.getText().toString());
                editext1.setText("");
                c=2;
            }
        });
        Button buttonmul=findViewById(R.id.buttonmul);
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.valueOf(editext1.getText().toString());
                editext1.setText("");
                c=3;
            }
        });
        Button buttondiv=findViewById(R.id.buttondiv);
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.valueOf(editext1.getText().toString());
                editext1.setText("");
                c=4;
            }
        });
        Button buttonequ=findViewById(R.id.buttonequal);
        buttonequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b= Double.valueOf(editext1.getText().toString());
                if(c==1)
                {ans =a+b;}
                else if(c==2)
                {ans=a-b;}
                else if(c==3)
                {ans=a*b;}
                else if(c==4)
                {ans=a/b;}
                editext1.setText(ans+"");
            }
        });
        Button buttonc=findViewById(R.id.buttonc);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                b=0;
                c=0;
                ans=0;
                editext1.setText("");
            }
        });






    }

}
