package com.iot.jesseboyd.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this gets called by the top fragment when the button is pushed
    @Override
    public void createMeme(String top, String bottom) {
    BottomPictureFragment bpf = (BottomPictureFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bpf.setMemeText(top,bottom);
    }




}
