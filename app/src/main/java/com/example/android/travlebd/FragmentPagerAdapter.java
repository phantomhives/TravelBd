package com.example.android.travlebd;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by LENOVO on 11/14/2017.
 */

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;
    public FragmentPagerAdapter(Context context , FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return  new DhakaFragment();
        }else if (position == 1){
            return new SyletFragment();
        }else if (position == 2){
            return new ChittagongFragment();
        }return new CoxBazarFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.dhaka_place);
        }else if (position == 1){
            return mContext.getString(R.string.sylet_place);
        }else if (position == 2){
            return mContext.getString(R.string.chittagong_place);
        }else return mContext.getString(R.string.cox_place);
    }
}
