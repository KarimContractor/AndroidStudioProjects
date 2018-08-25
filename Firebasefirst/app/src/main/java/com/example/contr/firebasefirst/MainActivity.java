package com.example.contr.firebasefirst;

import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    //@Override
    //protected void onStart() {
        //super.onStart();
        //FirebaseUser currentuser=mAuth.getCurrentUser();
        //mAuth.signInWithCustomToken(mCustomToken).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            //@Override
           // public void onComplete(@NonNull Task<AuthResult> task) {
           //if(task.isSuccessful())
           //{

             //  Log.d(Tag,"signInWithCustomToken:success");

           //}
          //  }
        //});
       // {

     //   }
   // }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth=FirebaseAuth.getInstance();
        Button btnadd=(Button)findViewById(R.id.btna1adduser);
        Button btnlog=(Button)findViewById(R.id.btna1login);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intn=new Intent(MainActivity.this,Adduser.class);
                startActivity(intn);
            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intn=new Intent(MainActivity.this,Login.class);
                startActivity(intn);
            }
        });

    }
}
