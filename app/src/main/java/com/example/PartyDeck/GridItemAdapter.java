package com.example.PartyDeck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridItemAdapter extends ArrayAdapter<ListItem> {
    private LayoutInflater mInflater;

    public GridItemAdapter(Context context, int rid, List<ListItem> list){
        super(context, rid, list);
        mInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ListItem item = (ListItem)getItem(position);

        View view = mInflater.inflate(R.layout.list_item, null);

        ImageView image;
        image = (ImageView)view.findViewById(R.id.image);
        image.setImageBitmap(item.image);

        TextView name;
        name = (TextView)view.findViewById(R.id.name);
        name.setText(item.name);

        return view;
    }
}
