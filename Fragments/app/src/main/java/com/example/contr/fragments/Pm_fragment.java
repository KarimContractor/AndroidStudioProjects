package com.example.contr.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.contr.fragments.R.*;


public class Pm_fragment extends Fragment {

    double a ;
    double b;
    int c;
    double ans;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lmfragment, container, false);



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final EditText editext1=getActivity().findViewById(id.editText1);

        Button button1=getActivity().findViewById(id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                editext1.append("1");
            }
        });
        Button button2= getActivity().findViewById(id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("2");

            }
        });
        Button button3=getActivity().findViewById(id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("3");
            }
        });
        Button button4=getActivity().findViewById(id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("4");
            }
        });
        Button button5=getActivity().findViewById(id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("5");
            }
        });
        Button button6=getActivity().findViewById(id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("6");
            }
        });
        Button button7=getActivity().findViewById(id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("7");
            }
        });
        Button button8=getActivity().findViewById(id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("8");
            }
        });
        Button button9=getActivity().findViewById(id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("9");
            }
        });
        Button button0=getActivity().findViewById(id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append("0");
            }
        });
        Button buttondot=getActivity().findViewById(id.buttondot);
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editext1.append(".");
            }
        });
        //final double a ;
        //double b;
        //double ans;
        Button buttonadd=getActivity().findViewById(id.buttonadd);
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a = Double.valueOf(editext1.getText().toString());
                editext1.setText("");
                c=1;
            }
        });
        Button buttonsub=getActivity().findViewById(id.buttonsub);
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.valueOf(editext1.getText().toString());
                editext1.setText("");
                c=2;
            }
        });
        Button buttonmul=getActivity().findViewById(id.buttonmul);
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.valueOf(editext1.getText().toString());
                editext1.setText("");
                c=3;
            }
        });
        Button buttondiv=getActivity().findViewById(id.buttondiv);
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.valueOf(editext1.getText().toString());
                editext1.setText("");
                c=4;
            }
        });
        Button buttonequ=getActivity().findViewById(id.buttonequal);
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
        Button buttonc=getActivity().findViewById(id.buttonc);
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