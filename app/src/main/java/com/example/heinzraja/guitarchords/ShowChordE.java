package com.example.heinzraja.guitarchords;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ShowChordE extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_chord_e);
        ViewPager viewPager = findViewById(R.id.viewpager);
        EchordSlideAdapter myadapter = new EchordSlideAdapter(this);
        viewPager.setAdapter(myadapter);
    }
}
