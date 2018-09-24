package com.example.daffodil_31.vcsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shivam.libmodule.MyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyClass myClass = new MyClass(10);
        //this comment is written in local only
        //this comment is added only in local
        //another comment added to local


        //this is a feature comment



    }
}
