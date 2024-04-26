package com.example.proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String comenta[] = {"uno", "dos"};

    String listproyect [] = {"Fragment num", "Fragment img"};

    int imgpro [] = {R.drawable.num, R.drawable.img};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.vistitas);
        listView.setOnItemClickListener(this);

        Adaptador adaptadorcito = new Adaptador(getApplicationContext(),comenta,listproyect,imgpro);
        listView.setAdapter(adaptadorcito);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(String.valueOf(position).equals("0")){
            Toast.makeText(this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, numbernav.class);
            startActivity(intent);
        }else if(String.valueOf(position).equals("1")){
            Toast.makeText(this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, imgnav.class);
            startActivity(intent);
        }
    }
}