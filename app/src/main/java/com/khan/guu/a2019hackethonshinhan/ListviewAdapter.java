package com.khan.guu.a2019hackethonshinhan;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ListviewAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Withdraw> data;
    private int layout;


    public ListviewAdapter(Context context, int list_layout, ArrayList<Withdraw> data) {

        this.inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data=data;
        this.layout=list_layout;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if(convertView == null){
            convertView = inflater.inflate(layout,viewGroup,false);
        };
        TextView textView_price_list = (TextView)convertView.findViewById(R.id.textView_price);
        TextView textView_date_list = (TextView)convertView.findViewById(R.id.textView_date);

        TextView textView_idx_list = (TextView)convertView.findViewById(R.id.textView_idx);
        TextView textView_total_list = (TextView)convertView.findViewById(R.id.textView_total);

        textView_price_list.setText(data.get(i).getPrice()+"");
        textView_date_list.setText(data.get(i).getDate()+"");

        textView_idx_list.setText(data.get(i).getIdx()+"");
        textView_total_list.setText(data.get(i).getTotal()+"");

        return convertView;
    }
}
