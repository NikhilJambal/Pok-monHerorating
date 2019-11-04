package com.example.heroratingapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Activity obj;
    int res;
    ArrayList <pokheroname> Al = new ArrayList <>();

    public MyAdapter(Activity obj, int res, ArrayList <pokheroname> Al) {

        this.obj = obj;
        this.res = res;
        this.Al = Al;
    }


    @Override
    public int getCount() {
        return Al.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.from(obj).inflate(res, viewGroup, false);
        pokheroname s = Al.get(i);
        ImageView imageView = view1.findViewById(R.id.img);
        TextView tv1 = view1.findViewById(R.id.tv_nem);
        TextView tv2 = view1.findViewById(R.id.tv_mob);
        imageView.setImageResource(s.getImage());
        tv1.setText(s.getPokname());
        tv2.setText(s.getPokpower());
        return view1;





    }
}
