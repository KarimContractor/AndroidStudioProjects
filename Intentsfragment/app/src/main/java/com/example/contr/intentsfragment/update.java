package com.example.contr.intentsfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        final conn sqldata=new conn(this);
        Button btnupda=(Button) findViewById(R.id.btnupdupdd);
        final EditText edtuser=(EditText)findViewById(R.id.edtupduser);
        final EditText edtpass=(EditText)findViewById(R.id.edtupdpass);
        final EditText edtid=(EditText)findViewById(R.id.edtupdid);
        btnupda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sqldata.upd(edtuser.getText().toString(),edtpass.getText().toString(),edtid.getText().toString());
            }
        });

    }
}
