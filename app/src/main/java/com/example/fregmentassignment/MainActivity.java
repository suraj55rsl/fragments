package com.example.fregmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SplashFragment tf=new SplashFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frameForFragment,tf).commit();
    }

    public void showTime(View view) {
        timeFragment tf=new timeFragment();
        FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameForFragment,tf);
        ft.commit();
        ft.addToBackStack(null);

    }
    public void showDate(View view) {
        dateFragment tf=new dateFragment();
        FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameForFragment,tf);
        ft.commit();
        ft.addToBackStack(null);

    }
    public void showBattery(View view) {
        batteryFragment tf=new batteryFragment();
        FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameForFragment,tf);
        ft.commit();
        ft.addToBackStack(null);

    }
}