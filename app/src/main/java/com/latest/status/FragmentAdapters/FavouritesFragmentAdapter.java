package com.latest.status.FragmentAdapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.latest.status.Fragments.Favourites.Jokes;
import com.latest.status.Fragments.Favourites.LoveQuotes;
import com.latest.status.Fragments.Favourites.Shayari;
import com.latest.status.Fragments.Favourites.Status;
import com.latest.status.R;

public class FavouritesFragmentAdapter extends FragmentPagerAdapter {

    public FavouritesFragmentAdapter(Context context, FragmentManager fm) {
        super(fm); this.context = context;
    }

    private  Context context;
    private String[] tabNames = {"STATUS","JOKES","LOVE QUOTES","SHAYARI"};

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.stat_tab);
            case 1:
                return context.getString(R.string.jokes_tab);
            case 2:
                return context.getString(R.string.loveQuotes_tab);
            case 3:
                return context.getString(R.string.shayari_tab);
        }
        return super.getPageTitle(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0 :    return new Status();
            case 1 :    return new Jokes();
            case 2 :    return new LoveQuotes();
            case 3 :    return new Shayari();
        }
        return new Status();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
