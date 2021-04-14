package com.example.omarad_midterm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DataBaseAccess2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Helper dbHelper=new Helper(this);
        setContentView(R.layout.activity_d_b_access2);
        setTitle("Activity 3");

        Button go1=findViewById(R.id.btn_go_3act1);
        Button go2=findViewById(R.id.btn_go_3act2);

        Button delete=findViewById(R.id.btn_delete);
        Button select=findViewById(R.id.btn_select);




        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c=Helper.getResult(.getText()+"");

                if (c==null){
                    Toast.makeText(DataBaseAccess2.this,"Records Deleted",Toast.LENGTH_SHORT).show();
                    return;
                }
                String message= c.getInt(0)+" "+
                        c.getString(1)+" "+
                        c.getString(2)+" "+
                        c.getString(3)+" "+
                        c.getString(4)+" ";

                Toast.makeText(DataBaseAccess2.this,"There is a Record "+message,Toast.LENGTH_LONG).show();



            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
           ;
            }
        });

        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataBaseAccess2.this,Introduction.class));
            }
        });
        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataBaseAccess2.this,DataBaseAccess.class));
            }
        });


    }
