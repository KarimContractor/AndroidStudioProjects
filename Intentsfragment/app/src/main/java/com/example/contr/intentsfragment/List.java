package com.example.contr.intentsfragment;

import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import static android.widget.Toast.makeText;

public class List extends AppCompatActivity {
    conn sqldata;
    conn sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        sqldata=new conn(this);
        //sqldata.list();


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,sqldata.list());





        ListView listV=(ListView)findViewById(R.id.listview);
        //listV.autofill((Cursor)sqldata.list1());
        //Cursor cursor=sqldata.list1();
        listV.setAdapter(itemsAdapter);


        //makeText(List.this, view+"id", Toast.LENGTH_LONG).show();

    }
}
