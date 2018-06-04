package com.latest.status.Activity;


import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.latest.status.Fragments.Main.FavouritesActivity;
import com.latest.status.Fragments.Main.JokesActivity;
import com.latest.status.Fragments.Main.LoveQuotesActivity;
import com.latest.status.Fragments.Main.ShayariActivity;
import com.latest.status.Fragments.Main.StatusActivity;
import com.latest.status.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawer;
    private NavigationView navView;
    private ActionBarDrawerToggle drawerToggle;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setNavView();

        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frag_view, new StatusActivity());
        transaction.commit();

    }

    private void setNavView(){
        drawer = findViewById(R.id.drawer);
        navView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this,drawer,R.string.drawer_open,R.string.drawer_close);
        drawer.addDrawerListener(drawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerToggle.syncState();
        navView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        transaction = getSupportFragmentManager().beginTransaction();
        switch(item.getItemId()){
            case R.id.nav_fav :
                transaction.replace(R.id.frag_view,new FavouritesActivity());
                break;
            case R.id.nav_jokes :
                transaction.replace(R.id.frag_view,new JokesActivity());
                break;
            case R.id.nav_love :
                transaction.replace(R.id.frag_view,new LoveQuotesActivity());
                break;
            case R.id.nav_shayari :
                transaction.replace(R.id.frag_view,new ShayariActivity());
                break;
            case R.id.nav_status :
                transaction.replace(R.id.frag_view,new StatusActivity());
                break;
        }
        transaction.commit();
        drawer.closeDrawers();
        return true;
    }
}
