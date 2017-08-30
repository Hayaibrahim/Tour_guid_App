package com.example.enghaya.pro;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ENG.HAYA on 8/29/2017 AD.
 */

public class Pageadapter extends FragmentPagerAdapter {
    private final int Tab = 4;
    private Context mContext;

    private String activity[] = new String[]{
            clinic.NAME,
            university.NAME,
            supermarket.NAME,
    };

    public Pageadapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return Tab;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, supermarket.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, clinic.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, university.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, coffeeshop.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return activity[position];
    }
}
