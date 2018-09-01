package com.example.heinzraja.guitarchords;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CchordSlideAdapter extends PagerAdapter {
    private Context context;

    private int[] imgs = {
            R.drawable.cmaj,
            R.drawable.cmin
    };

    private String[] texts = {
            "C Major",
            "C Minor"
    };

    CchordSlideAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view== (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.cchordslide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.cchordslidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.cchslideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.chordtitle);

        imgslide.setImageResource(imgs[position]);
        txttitle.setText(texts[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
