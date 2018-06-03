package com.latest.status.FragmentAdapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.latest.status.Fragments.Status.English;
import com.latest.status.Fragments.Status.Hindi;
import com.latest.status.Fragments.Status.LovePics;
import com.latest.status.Fragments.Status.Punjabi;
import com.latest.status.Fragments.Status.Tamil;
import com.latest.status.Fragments.Status.Videos;
import com.latest.status.R;

public class StatusFragmentAdapter extends FragmentPagerAdapter{
    public StatusFragmentAdapter(Context context, FragmentManager fm) {
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
