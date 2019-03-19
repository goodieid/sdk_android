package com.goodie.library.ui.adapters.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Goodie on 04/02/2019.
 */

public class VoucherPageAdapter extends FragmentPagerAdapter{

    protected final List<Fragment> mFragmentList = new ArrayList<>();
    protected final List<String> mFragmentTitleList = new ArrayList<>();

    public VoucherPageAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

}
