package com.latest.status.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.latest.status.Adapters.MainFragmentAdapter;
import com.latest.status.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Viewpager
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new MainFragmentAdapter(this,getSupportFragmentManager()));
        //Tablayout
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
