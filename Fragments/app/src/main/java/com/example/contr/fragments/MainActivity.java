package com.example.contr.fragments;

import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import android.os.Bundle;
import android.app.FragmentManager;


public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Configuration confi=getResources().getConfiguration();
        Lm_fragment lmfrag=new Lm_fragment();
        Pm_fragment pmfrag=new Pm_fragment();
        if(confi.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {


            //fragmentTransaction.remove(pmfrag);
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();


            fragmentTransaction.replace(android.R.id.content,lmfrag).addToBackStack(null).commit();
            fragmentTransaction.show(lmfrag);

        }
        else if(confi.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            //fragmentTransaction.remove(lmfrag);}
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();




            fragmentTransaction.replace(android.R.id.content,pmfrag).addToBackStack(null).commit();
            fragmentTransaction.show(pmfrag);
        }
       // fragmentTransaction.commit();



    }

}

