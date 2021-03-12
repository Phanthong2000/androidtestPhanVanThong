package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoogleAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Google> arrayList;

    public CustomGoogleAdapter(Context context, int layout, ArrayList<Google> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
        convertView = LayoutInflater.from(context).inflate(layout,parent,false);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView price = (TextView) convertView.findViewById(R.id.name4);
        ImageView imageView =(ImageView) convertView.findViewById(R.id.imgID);
        name.setText(arrayList.get(position).getName());
        price.setText(arrayList.get(position).getPrice());
        imageView.setImageResource(arrayList.get(position).getImg());

        return convertView;
    }
}
