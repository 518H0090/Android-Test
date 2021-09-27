package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class employeeAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Employee> employeeList;

    public employeeAdapter(Context context, int layout, List<Employee> employeeList) {
        this.context = context;
        this.layout = layout;
        this.employeeList = employeeList;
    }

    @Override
    public int getCount() {
        return this.employeeList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.employeeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(layout,null);

        ImageView imgView = (ImageView) convertView.findViewById(R.id.imgView);
        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        TextView txtAge = (TextView) convertView.findViewById(R.id.txtAge);

        Employee employee = employeeList.get(position);

        imgView.setImageResource(employee.getImg());
        txtName.setText(employee.getName());
        txtAge.setText(employee.getAge()+"");

        return convertView;
    }
}
