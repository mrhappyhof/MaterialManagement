package com.vcp_hof.material.materialmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnConnect(View v){
        System.out.println("connected");
        startActivity(new Intent(this, MainMenu.class));
    }
    //donee
}

