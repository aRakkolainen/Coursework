package com.example.exerciseproject3;/*Created by Aino Räkköläinen but this is mainly based on the android tutorial video 3, code is from there */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.exerciseproject3.R;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] items;
    String[] prices;
    String[] descriptions;

    public ItemAdapter(Context c, String[] i,String[] p, String[] d) {
        items = i;
        prices = p;
        descriptions = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.my_listview_detailed, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nametextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.pricetextView);

        String name = items[i];
        String description = descriptions[i];
        String price = prices[i];

        nameTextView.setText(name);
        descriptionTextView.setText(description);
        priceTextView.setText(price);
        return v;
    }
}
