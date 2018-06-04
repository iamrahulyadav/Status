package com.latest.status.Activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.latest.status.Fragments.Main.StatusActivity;
import com.latest.status.R;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    private NavigationView navView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frag_view, new StatusActivity());
        transaction.commit();

        setNavView();
    }

    private void setNavView(){

    }

}
