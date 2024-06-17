package com.speed.tab_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tabs;
ViewPager viewPager;

//for using sliding purpose


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewPager);

        //adapter = connects the User Interfaces and the data Source
        ViewPagerMessangerAdapter adapter = new ViewPagerMessangerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);

    }
}