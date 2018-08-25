package com.example.contr.firebasefirst;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class Listfire extends AppCompatActivity {
    private Activity context;
    DatabaseReference databaseReference;
    Firehelper helper;

    List<User> user;
    public Listfire(@NonNull Context context, List<User> user)
    {
        //super(context , R.layout.activity_listfire , user);
        this.context= (Activity) context;
        this.user=user;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listfire);
        final ListView listView=(ListView)findViewById(R.id.listviewlay);
        final ArrayList<String> userlist=new ArrayList<>();

        databaseReference= FirebaseDatabase.getInstance().getReference();
        helper=new Firehelper(databaseReference);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,helper.retrieve());
        listView.setAdapter(itemsAdapter);
}}
