package com.latest.status.Adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.latest.status.Fragments.English;
import com.latest.status.Fragments.Hindi;
import com.latest.status.Fragments.LovePics;
import com.latest.status.Fragments.Punjabi;
import com.latest.status.Fragments.Tamil;
import com.latest.status.Fragments.Videos;
import com.latest.status.R;

public class MainFragmentAdapter extends FragmentPagerAdapter{
    public MainFragmentAdapter(Context context, FragmentManager fm) {
        super(fm); this.context = context;
    }

    private  Context context;
    private String[] tabNames = {"ENGLISH","HINDI","LOVE PICS","PUNJABI","TAMIL","VIDEOS"};

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.eng_tab);
            case 1:
                return context.getString(R.string.hindi_tab);
            case 2:
                return context.getString(R.string.love_tab);
            case 3:
                return context.getString(R.string.punjabi_tab);
            case 4:
                return context.getString(R.string.tamil_tab);
            case 5:
                return context.getString(R.string.video_tab);
        }
        return super.getPageTitle(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0 :    return new English();
            case 1 :    return new Hindi();
            case 2 :    return new LovePics();
            case 3 :    return new Punjabi();
            case 4 :    return new Tamil();
            case 5 :    return new Videos();
        }
        return new English();
    }

    @Override
    public int getCount() {
        return 6;
    }
}
