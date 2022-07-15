package com.example.aularecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TelaBiblioteca extends AppCompatActivity {
    static ArrayList<Livro> biblioteca;
    RecyclerView rv;
    Adaptador junior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_biblioteca);
        getSupportActionBar().hide();
        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        junior = new Adaptador(this, biblioteca, new Adaptador.onItemClickListener() {
            @Override
            public void onItemcClick(Livro livro) {

            }
        });
        rv.setAdapter(junior);
        junior.notifyDataSetChanged();
    }
}