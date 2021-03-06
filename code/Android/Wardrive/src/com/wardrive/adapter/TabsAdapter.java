package com.wardrive.adapter;

import com.wardrive.HomeFragment;
import com.wardrive.Method1Fragment;
import com.wardrive.Method2Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsAdapter extends FragmentPagerAdapter {
 
    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // HOME FRAGMENT ACTIVITY
            return new HomeFragment();
        case 1:
            // DATABASE STATISTICS DISPLAY ACTIVITY
            return new Method1Fragment();
        case 2:
            // CREDITS ACTIVITY
            return new Method2Fragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}