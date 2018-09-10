package com.example.contr.firebasefirst;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

public class listuser extends ArrayAdapter<User> {
private  Activity context;
    List<User> list;

//    @Override
  //  protected void onCreate(Bundle savedInstanceState) {

    //    super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_listuser);
    //}

    public listuser(@NonNull Context context, List<User> list)
    {
        super(context,R.layout.activity_listuser, list);
        this.context=(Activity)context;
        this.list=list;

    }

    public View getview(int position,@Nullable View convertView,@NonNull ViewGroup parent)
    {
        LayoutInflater inflater=context.getLayoutInflater();
        View listviewitem =inflater.inflate(R.layout.activity_listuser,null,true);
        TextView txtv1=(TextView)listviewitem.findViewById(R.id.txtv1);
        TextView txtv2=(TextView)listviewitem.findViewById(R.id.txtv2);
        User user=list.get(position);
        txtv1.setText(user.getUsername());
        txtv2.setText(user.getPassword());
        return  listviewitem;

    }

}
