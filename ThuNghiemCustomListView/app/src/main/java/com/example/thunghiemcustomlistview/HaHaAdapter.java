package com.example.thunghiemcustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HaHaAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<HaHa> haHaList;

    public HaHaAdapter(Context context, int layout, List<HaHa> haHaList) {
        this.context = context;
        this.layout = layout;
        this.haHaList = haHaList;
    }

    @Override
    public int getCount() {
        return this.haHaList.size();
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
        // lấy con text
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // lấy layout
        convertView = layoutInflater.inflate(layout,null);

        //Ánh Xạ
        TextView txtName = convertView.findViewById(R.id.txtName);
        TextView txtAge = convertView.findViewById(R.id.txtAge);
        ImageView imgView = convertView.findViewById(R.id.imgView);


        HaHa haHa = haHaList.get(position);

        txtName.setText(haHa.getName());
        txtAge.setText(haHa.getTuoi()+"");
        imgView.setImageResource(haHa.getImg());

        return convertView;
    }
}
