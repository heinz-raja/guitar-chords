package com.example.heinzraja.guitarchords;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EchordSlideAdapter extends PagerAdapter{
    Context context;
    LayoutInflater inflater;

    public int[] imgs={
            R.drawable.emaj,
            R.drawable.emin
    };

    public String[] texts={
            "E Major",
            "E Minor"
    };

    public EchordSlideAdapter(Context context){
        this.context=context;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.echordslide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.echordslidelinearlayout);
        ImageView imageslide = (ImageView) view.findViewById(R.id.echordslideimg);
        TextView textslide = (TextView) view.findViewById(R.id.chordtitle);
        imageslide.setImageResource(imgs[position]);
        textslide.setText(texts[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }
}
