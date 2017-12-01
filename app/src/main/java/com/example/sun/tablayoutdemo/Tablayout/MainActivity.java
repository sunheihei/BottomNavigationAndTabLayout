package com.example.sun.tablayoutdemo.Tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.sun.tablayoutdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    TabLayout.Tab OneTab;
    TabLayout.Tab TwoTab;
    TabLayout.Tab ThreeTab;


    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.viewpager)
    ViewPager mViewpager;
    @BindView(R.id.tablayout)
    TabLayout mTablayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        mTablayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mTablayout.setupWithViewPager(mViewpager);
        mViewpager.setAdapter(new TabAdapter(getSupportFragmentManager()));
        mViewpager.setOffscreenPageLimit(3);
        OneTab = mTablayout.getTabAt(0).setText(getString(R.string.one));
        TwoTab = mTablayout.getTabAt(1).setText(getString(R.string.two));
        ThreeTab = mTablayout.getTabAt(2).setText(getString(R.string.three));
    }
}
