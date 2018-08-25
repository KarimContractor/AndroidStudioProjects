package com.example.contr.intentsfragment;


import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;


public class Main2Activity extends AppCompatActivity {

    conn databasehelper;
    EditText edtuser,edtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        databasehelper=new conn(this);
        edtuser=(EditText) findViewById(R.id.txtuser);
        edtpass=(EditText) findViewById(R.id.txtpass);

        Button btncre=(Button) findViewById(R.id.btnCre);
        btncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean a=databasehelper.add(edtuser.getText().toString(),edtpass.getText().toString());

                if (a) {

                    makeText(Main2Activity.this, "Done", Toast.LENGTH_LONG).show();
                } else {
                    makeText(Main2Activity.this, "NotDone", Toast.LENGTH_LONG).show();
                }



            }
        });
    }
}
