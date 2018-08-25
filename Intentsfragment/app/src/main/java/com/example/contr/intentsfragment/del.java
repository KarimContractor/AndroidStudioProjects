package com.example.contr.intentsfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class del extends AppCompatActivity {
conn sqldatahelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del);
        sqldatahelper=new conn(this);
        Button btndel=(Button)findViewById(R.id.btndeldel);
        final EditText edt1=(EditText)findViewById(R.id.edt1);
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean a=sqldatahelper.del(Integer.parseInt(edt1.getText().toString()));
            }
        });
            }
}
