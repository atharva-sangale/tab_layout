package com.speed.tab_layout;

import android.icu.text.Transliterator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessangerAdapter extends FragmentPagerAdapter  {

    public ViewPagerMessangerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new afragment();
        }

        else if (position == 1){
            return new bfragment();
        }else{
            return new cfragment();
        }
    }

    @Override
    public int getCount() {

        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
      if (position==0){
          return "Chats";
      }
      else if (position==1){
          return "Status";
      }
      else{
          return "Calls";
        }
    }
}
