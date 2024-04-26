package com.example.proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    String[] comt_list = {"uno", "dos"};

    String[] proj_list = {"Fragment num", "Fragment img"};

    int[] img_list = {R.drawable.num, R.drawable.img};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.vistitas);
        listView.setOnItemClickListener(this);

        AppAdapter adaptadorcito = new AppAdapter(getApplicationContext(),comt_list,proj_list,img_list);
        listView.setAdapter(adaptadorcito);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        if(String.valueOf(position).equals("0"))
        {
            Toast.makeText(this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, NumberNav.class);
            startActivity(intent);
        }
        else if(String.valueOf(position).equals("1"))
        {
            Toast.makeText(this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ImageNav.class);
            startActivity(intent);
        }
    }
}