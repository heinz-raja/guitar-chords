package com.example.heinzraja.guitarchords;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AchordSlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] images={
            R.drawable.amaj,
            R.drawable.amin
    };

    public String[] text={
            "A Major",
            "A Minor"
    };
    AchordSlideAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==(LinearLayout)object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.dchordslide,container,false);
        LinearLayout linearslide = view.findViewById(R.id.dchordslidelinearlayout);
        ImageView imageslide = view.findViewById((R.id.dchordslideimg));
        TextView textslide = view.findViewById(R.id.chordtitle);

        imageslide.setImageResource(images[position]);
        textslide.setText(text[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
