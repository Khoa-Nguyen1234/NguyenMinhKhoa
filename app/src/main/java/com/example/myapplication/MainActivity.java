package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2= findViewById(R.id.viewPager2);
        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        ViewPaper2Adapter adapter = new ViewPaper2Adapter(this);
        viewPager2.setAdapter(adapter);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.menu_home) {
                    viewPager2.setCurrentItem(0);
                } else if (item.getItemId() == R.id.menu_course) {
                    viewPager2.setCurrentItem(1);
                } else if (item.getItemId() == R.id.menu_song) {
                    viewPager2.setCurrentItem(2);
                } else {
                    viewPager2.setCurrentItem(0);
                }
                return true;
            }
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                switch (position)
                {
                    case 0:
                        bottomNav.getMenu().findItem(R.id.menu_home).setChecked(true);
                        break;
                    case 1:
                        bottomNav.getMenu().findItem(R.id.menu_course).setChecked(true);
                        break;
                    case 2:
                        bottomNav.getMenu().findItem(R.id.menu_song).setChecked(true);
                        break;
                }
                super.onPageSelected(position);
            }
        });

    }
}