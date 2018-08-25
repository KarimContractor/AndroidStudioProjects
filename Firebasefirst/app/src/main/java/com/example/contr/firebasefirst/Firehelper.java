package com.example.contr.firebasefirst;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class Firehelper {
    DatabaseReference db;
    Boolean saved=null;
    ArrayList<String> userarray=new ArrayList<>();
    ArrayList<String> userarrays=new ArrayList<String>(){};
    public Firehelper(DatabaseReference db)
    {
        this.db=db;


    }
    public ArrayList<String> retrieve()
    {

        db.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    return userarrays;
    }
    private void fetchData(DataSnapshot dataSnapshot)
    {
        userarrays.clear();

        for (DataSnapshot ds : dataSnapshot.getChildren())
        {
            String []strings=new String[]{ds.getValue(User.class).getUsername().toString(),ds.getValue(User.class).getPassword().toString(),ds.getValue(User.class).getId().toString()};
            String name=ds.getValue(User.class).getUsername().toString();
            String password=ds.getValue(User.class).getPassword().toString();
            String id=ds.getValue(User.class).getId().toString();

            userarrays.add(strings.toString());//= new String[]{id, name, password};

        }
    }

}
