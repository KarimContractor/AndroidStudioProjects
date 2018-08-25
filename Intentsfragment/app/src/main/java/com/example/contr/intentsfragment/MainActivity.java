package com.example.contr.intentsfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btndelete=(Button)findViewById(R.id.btndelete);
        Button btnadd=(Button)findViewById(R.id.btnadd);
        Button btnlist=(Button)findViewById(R.id.btnlist);
        Button btnedit=(Button) findViewById(R.id.btnedt);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intn=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intn);
            }
        });
        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intn=new Intent(MainActivity.this,List.class);
                startActivity(intn);
            }
        });
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intn=new Intent(MainActivity.this,del.class);
                startActivity(intn);
            }
        });
        btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intn=new Intent(MainActivity.this,update.class);
                startActivity(intn);
            }
        });

    }
}
