package com.wolfsoft.giftapp_ob1;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.ViewpagerAdapter_Ob1;
import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    private ViewpagerAdapter_Ob1 viewpagerAdapter;
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        CircleIndicator circleIndicator =(CircleIndicator) findViewById(R.id.circleindicator);
        viewpagerAdapter = new ViewpagerAdapter_Ob1(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapter);
        circleIndicator.setViewPager(viewPager);
        viewpagerAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());
    }
}
