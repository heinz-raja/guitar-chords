package com.example.heinzraja.guitarchords;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class DchordSlideAdapter extends PagerAdapter {
    private Context context;

    private int[] images={
            R.drawable.dmaj,
            R.drawable.dmin
    };

    private String[] texts={
            "D Major",
            "D Minor"
    };

    DchordSlideAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.dchordslide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.dchordslidelinearlayout);
        ImageView imageslide = (ImageView) view.findViewById(R.id.dchordslideimg);
        TextView textslide = (TextView) view.findViewById(R.id.chordtitle);

        imageslide.setImageResource(images[position]);
        textslide.setText(texts[position]);
        container.addView(view);
        return view;
    }
}
