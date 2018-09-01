package com.example.heinzraja.guitarchords;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShowChordC extends AppCompatActivity {
    private ViewPager viewPager;
    private CchordSlideAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_chord_c);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new CchordSlideAdapter(this);
        viewPager.setAdapter(myadapter);
    }
}
