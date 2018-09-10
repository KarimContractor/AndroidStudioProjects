package com.example.contr.firebasefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Adduser extends AppCompatActivity {

    EditText txtadduser,txtaddpass;
    Button btnadduser;
    DatabaseReference firebaseDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adduser);
        txtadduser = (EditText) findViewById(R.id.txtadduser);
        txtaddpass = (EditText) findViewById(R.id.txtaddpass);
        btnadduser=(Button)findViewById(R.id.btnadduser);
        firebaseDatabase=FirebaseDatabase.getInstance().getReference("fir-first-f2718");
        btnadduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=txtadduser.getText().toString();
                String pass=txtaddpass.getText().toString();

                if(!TextUtils.isEmpty(user) && !TextUtils.isEmpty(pass))
                {

                    String id=firebaseDatabase.push().getKey();
                    User us=new User(id,user,pass);
                    firebaseDatabase.child(id).setValue(us);

                    Toast.makeText(getApplicationContext(),"User Added",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Fill All the Text Boxes",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}