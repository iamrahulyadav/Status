package com.latest.status.FragmentAdapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.latest.status.Fragments.LoveQuotes.Message;
import com.latest.status.Fragments.LoveQuotes.Status;
import com.latest.status.R;

public class LoveQuotesFragmentAdapter extends FragmentPagerAdapter{

    public LoveQuotesFragmentAdapter(Context context, FragmentManager fm) {
        super(fm); this.context = context;
    }

    private  Context context;
    private String[] tabNames = {"MESSAGE","STATUS"};

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.msg_tab);
            case 1:
                return context.getString(R.string.stat_tab);
        }
        return super.getPageTitle(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0 :    return new Message();
            case 1 :    return new Status();
        }
        return new Message();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
