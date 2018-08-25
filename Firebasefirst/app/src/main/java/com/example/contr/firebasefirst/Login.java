package com.example.contr.firebasefirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {
    DatabaseReference databaseReference;
    boolean a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText edtuser=(EditText)findViewById(R.id.txtloginuser);
        final EditText edtpass=(EditText)findViewById(R.id.txtloginpass);
        Button btnlogin=(Button)findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final List<User>userlist=new ArrayList<>();
                databaseReference= FirebaseDatabase.getInstance().getReference();
                Query ref=databaseReference.child("fir-first-f2718").orderByChild("username");

                //Toast.makeText(getApplicationContext(),"Found",Toast.LENGTH_SHORT).show();
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        for(DataSnapshot postsnap:dataSnapshot.getChildren())
                        {long b=postsnap.getChildrenCount();


                                User user = postsnap.getValue(User.class);
                                userlist.add(user);
                                dataSnapshot.getChildren();
                                a = user.getUsername().equals(edtuser.getText().toString()) && user.getPassword().equals(edtpass.getText().toString());
                            if(a==true)
                            {
                                break;
                            }



                        }
                        if(a==true)
                        {
                            Toast.makeText(getApplicationContext(),"Found",Toast.LENGTH_SHORT).show();
                            Intent intn=new Intent(Login.this,Listfire.class);
                            startActivity(intn);

                        }
                        else{Toast.makeText(getApplicationContext(),"Not Found",Toast.LENGTH_SHORT).show();}


                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {


                    }
                });
            }
        });

    }
}
