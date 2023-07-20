package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPaper2Adapter extends FragmentStateAdapter {
    public ViewPaper2Adapter(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position){
        if (position ==2)
            return new SongFragment();
        else if (position == 1)
            return new CourseFragment();
        else
            return new HomeFragment();
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}
