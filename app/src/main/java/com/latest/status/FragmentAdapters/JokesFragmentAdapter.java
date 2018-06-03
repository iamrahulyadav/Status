package com.latest.status.FragmentAdapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.latest.status.R;

public class JokesFragmentAdapter extends FragmentPagerAdapter {

    public JokesFragmentAdapter(Context context, FragmentManager fm) {
        super(fm); this.context = context;
    }

    private  Context context;
    private String[] tabNames = {"ENGLISH","HINDI"};

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.eng_tab);
            case 1:
                return context.getString(R.string.hindi_tab);
        }
        return super.getPageTitle(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0 :    return new com.latest.status.Fragments.Jokes.English();
            case 1 :    return new com.latest.status.Fragments.Jokes.Hindi();
        }
        return new com.latest.status.Fragments.Jokes.English();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
