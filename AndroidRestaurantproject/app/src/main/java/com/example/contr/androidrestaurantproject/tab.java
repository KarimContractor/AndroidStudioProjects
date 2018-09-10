package com.example.contr.androidrestaurantproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        EditText txtordname=(EditText)findViewById(R.id.txtordname);
        EditText txtordcontact=(EditText)findViewById(R.id.txtordcont);
        EditText txtordnumper=(EditText)findViewById(R.id.txtordnumper);
        EditText txtorddate=(EditText)findViewById(R.id.txtorddate);
        EditText txtordtime=(EditText)findViewById(R.id.txtordtime);
        Button btnordsubmit1=(Button)findViewById(R.id.btnordsubmit1);
        btnordsubmit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intn=new Intent(tab.this,tab1.class);
                startActivity(intn);
            }
        });

    }
}
