package com.example.contr.intentsfragment;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.text.PrecomputedTextCompat;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.jar.Attributes;

public class conn extends SQLiteOpenHelper {

    SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
    public conn(Context context) {
        super(context, "testing", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
sqLiteDatabase.execSQL("CREATE TABLE LOGS (ID INTEGER PRIMARY KEY, USERNAME TEXT , PASSWORD TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS LOGS");
        onCreate(sqLiteDatabase);

    }
    public boolean add(String USER,String PASS)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("USERNAME", USER);
        contentValues.put("PASSWORD", PASS);
        long res=sqLiteDatabase.insert("LOGS",null,contentValues);
        if(res == -1)
        {
        return  false;}
            else{
                return  true;}


    }
    public ArrayList list()
    {
        sqLiteDatabase =this.getReadableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("select *from LOGS",null);
        ArrayList<HashMap<String,String>>userlist=new ArrayList<>();
        if(cursor.moveToFirst())
        {

            do{
                HashMap<String, String> user = new HashMap<>();
                user.put("ID", cursor.getString(cursor.getColumnIndex("ID")));
                user.put("UserName", cursor.getString(cursor.getColumnIndex("USERNAME")));
                user.put("Password", cursor.getString(cursor.getColumnIndex("PASSWORD")));
                userlist.add(user);

            }while (cursor.moveToNext());


        }
return userlist;

    }
    public boolean del(int id)
    {
        //sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("select *from LOGS",null);
        Product product=new Product();

        if(cursor.moveToFirst())
        {
            sqLiteDatabase=this.getWritableDatabase();
            //String[] strings = {cursor.getString(0)};
            product.setID(Integer.parseInt(cursor.getString(0)));

//String colid="ID";

            int i = sqLiteDatabase.delete("LOGS", "ID="+id, new String[]{String.valueOf(product.getID())});
            cursor.close();

            //Cursor o=sqLiteDatabase.rawQuery("DELETE FROM LOGS WHERE ID=="+id,new String[]{String.valueOf(product.getID())});
            sqLiteDatabase.close();
            return true;
        }
        else{
            sqLiteDatabase.close();
            return  false;}

    }
    public int upd(String user,String pass,String id)
    {
        sqLiteDatabase=this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("USERNAME", user.toString());
        values.put("PASSWORD", pass.toString());
        String [] str={id};
        String[]strin={user,pass};

        return sqLiteDatabase.update("LOGS",values,"ID=="+Integer.parseInt(id.toString()) ,null);


    }
    public class Product {

        private int _id;
        private String _productname;
        private int _quantity;

        public Product() {

        }

        public Product(int id, String productname, int quantity) {
            this._id = id;
            this._productname = productname;
            this._quantity = quantity;
        }

        public Product(String productname, int quantity) {
            this._productname = productname;
            this._quantity = quantity;
        }

        public void setID(int id) {
            this._id = id;
        }

        public int getID() {
            return this._id;
        }

        public void setProductName(String productname) {
            this._productname = productname;
        }

        public String getProductName() {
            return this._productname;
        }

        public void setQuantity(int quantity) {
            this._quantity = quantity;
        }

        public int getQuantity() {
            return this._quantity;
        }
    }


}
