package com.example.contr.firebasefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Listfire extends AppCompatActivity {
    ListView listuser;
    DatabaseReference datauser;
    List<User> users;

    @Override
    protected void onStart() {
        super.onStart();
        datauser.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                users.clear();
                for(DataSnapshot posSnapshot:dataSnapshot.getChildren())
                {
                    User user=posSnapshot.getValue(User.class);
                    users.add(user);
                }
                listuser arrayList=new listuser(Listfire.this,users);
                listuser.setAdapter(arrayList);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listfire2);
        listuser=(ListView)findViewById(R.id.listview);
datauser=FirebaseDatabase.getInstance().getReference("fir-first-f2718");
users=new ArrayList<>();


    }
}
