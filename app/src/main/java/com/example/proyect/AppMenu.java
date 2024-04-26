package com.example.proyect;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class AppMenu extends Fragment implements View.OnClickListener
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        ImageButton btnoran = view.findViewById(R.id.imageButton1);
        btnoran.setOnClickListener(this);

        ImageButton btnpera = view.findViewById(R.id.imageButton2);
        btnpera.setOnClickListener(this);

        ImageButton btnsan = view.findViewById(R.id.imageButton3);
        btnsan.setOnClickListener(this);

        ImageButton btnuva = view.findViewById(R.id.imageButton4);
        btnuva.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();

        if (id == R.id.imageButton1)
        {
            Navigation.findNavController(v).navigate(R.id.orange);
        }
        else if (id == R.id.imageButton2)
        {
            Navigation.findNavController(v).navigate(R.id.pera);
        }
        else if (id == R.id.imageButton3)
        {
            Navigation.findNavController(v).navigate(R.id.sandia);
        }
        else if (id == R.id.imageButton4)
        {
            Navigation.findNavController(v).navigate(R.id.uva);
        }
    }
}