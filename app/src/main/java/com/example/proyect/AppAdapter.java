package com.example.proyect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AppAdapter extends BaseAdapter
{
    int[] img_list;

    String[] proj_list;
    String[] comt_list;

    Context context;
    LayoutInflater inflater;

    public AppAdapter(Context context, String[] proj_list, String[] comt_list, int[] img_list)
    {
        this.context = context;
        this.proj_list = proj_list;
        this.comt_list = comt_list;
        this.img_list = img_list;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return comt_list.length;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = inflater.inflate(R.layout.lista,null);

        TextView txtview = convertView.findViewById(R.id.texto1);
        TextView txtview2 = convertView.findViewById(R.id.texto2);
        ImageView deporteimg = convertView.findViewById(R.id.imagen);

        txtview.setText(proj_list[position]);
        txtview2.setText(comt_list[position]);
        deporteimg.setImageResource(img_list[position]);

        return convertView;
    }
}