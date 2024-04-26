package com.example.proyect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    Context contexto;

    String listaproyectos[];

    String listacomentar[];

    int listaimagenes[];

    LayoutInflater inflater;

    public Adaptador(Context contexto, String[] listaproyectos, String[] listacomentar, int[] listaimagenes) {
        this.contexto = contexto;
        this.listaproyectos = listaproyectos;
        this.listacomentar = listacomentar;
        this.listaimagenes = listaimagenes;
        this.inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount() {
        return listacomentar.length;
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
        convertView = inflater.inflate(R.layout.lista,null);
        TextView  txtview = convertView.findViewById(R.id.texto1);
        TextView  txtview2 = convertView.findViewById(R.id.texto2);
        ImageView deporteimg = convertView.findViewById(R.id.imagen);

        txtview.setText(listaproyectos[position]);
        txtview2.setText(listacomentar[position]);
        deporteimg.setImageResource(listaimagenes[position]);

        return convertView;
    }
}
