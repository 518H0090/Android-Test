package com.google.recycleviewtest;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder>{

    private Context context;
    private List<Name> list;

    public NameAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Name> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_custom,parent,false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        Name name = list.get(position);
        if (name == null) {
            return;
        }

        holder.textName.setText(name.getName());
        holder.textCode.setText(name.getCode()+"");
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder {

        TextView textName,textCode;

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = (TextView) itemView.findViewById(R.id.textName);
            textCode = (TextView) itemView.findViewById(R.id.textCode);
        }
    }

}
