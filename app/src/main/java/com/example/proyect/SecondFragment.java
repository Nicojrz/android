package com.example.proyect;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFragment extends Fragment  implements View.OnClickListener
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_segundo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        Button botoncitto = view.findViewById(R.id.btnatras);

        botoncitto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Navigation.findNavController(v).navigate(R.id.principal);
    }
}