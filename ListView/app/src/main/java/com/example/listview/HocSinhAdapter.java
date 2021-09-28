package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class HocSinhAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<HocSinh> arrayHocsinh;

    public HocSinhAdapter(Context context, int layout, List<HocSinh> arrayHocsinh) {
        this.context = context;
        this.layout = layout;
        this.arrayHocsinh = arrayHocsinh;
    }

    @Override
    public int getCount() {
        return this.arrayHocsinh.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(layout,null);


        return null;
    }
}
