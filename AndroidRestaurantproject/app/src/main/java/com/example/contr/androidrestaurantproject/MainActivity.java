package com.example.contr.androidrestaurantproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextph;
    Button btncontin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editTextph=(EditText)findViewById(R.id.editTextph);
         btncontin=(Button) findViewById(R.id.btnmain);
         btncontin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String moblile=editTextph.getText().toString();
                 if(moblile.isEmpty() || moblile.length()<10)
                 {
                     editTextph.setError("Enter a Valid Mobile number");
                     editTextph.requestFocus();
                     return;
                 }
                 else{
                     Intent intn=new Intent(MainActivity.this,verify.class);
                     intn.putExtra("mobile",moblile);
                     startActivity(intn);
                 }

             }
         });
    }
}
