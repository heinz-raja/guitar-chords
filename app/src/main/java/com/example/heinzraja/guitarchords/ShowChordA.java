package com.example.heinzraja.guitarchords;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ShowChordA extends AppCompatActivity {
    private ViewPager viewPager;
    private AchordSlideAdapter myadapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_chord_d);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new AchordSlideAdapter(this);
        viewPager.setAdapter(myadapter);
    }
}
