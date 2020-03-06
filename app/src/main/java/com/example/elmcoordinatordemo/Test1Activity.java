package com.example.elmcoordinatordemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Test1Activity extends AppCompatActivity {
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.behavior_scrolling);
        RecyclerView recyclerView = findViewById(R.id.my_rec);
        MyAdapter adapter = new MyAdapter(this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
//        ArrayList<Fragment> fragments = new ArrayList<>();
//        ArrayList<String> titles = new ArrayList<>();
//
//        fragments.add(TypeFragment.newInstance());
//        fragments.add(TypeFragment.newInstance());
//        fragments.add(TypeFragment.newInstance());
//
//        titles.add("tab1");
//        titles.add("tab2");
//        titles.add("tab3");
//
//        mViewPager = (ViewPager) findViewById(R.id.viewpager);
//        TabLayout tableLayout = (TabLayout) findViewById(R.id.tablayout);
//
//        MyPageAdapter mTypeAdapter = new MyPageAdapter(getSupportFragmentManager());
//        mTypeAdapter.setData(fragments, titles);
//        mViewPager.setAdapter(mTypeAdapter);
//        mViewPager.setOffscreenPageLimit(titles.size() - 1);
//
//        tableLayout.setupWithViewPager(mViewPager);
//        tableLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                mViewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
    }

}
