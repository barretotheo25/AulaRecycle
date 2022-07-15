package com.example.aularecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText titulo, autor, genero, classEdu, sinopse, isbn;
    ArrayList<Livro> biblioteca = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        titulo = findViewById(R.id.titulo);
        autor = findViewById(R.id.autor);
        genero = findViewById(R.id.genero);
        classEdu = findViewById(R.id.classEdu);
        sinopse = findViewById(R.id.sinopse);
        isbn = findViewById(R.id.isbn);
    }

    public void cadastrar(View f){
        String t = titulo.getText().toString();
        String a = autor.getText().toString();
        String g = genero.getText().toString();
        String c = classEdu.getText().toString();
        String s = sinopse.getText().toString();
        String i = isbn.getText().toString();
        Livro novoLivro = new Livro(t, a, g, c, s, i);
        biblioteca.add(novoLivro);
        Toast.makeText(this, "Cadastrado com sucesso", Toast.LENGTH_LONG).show();
    }

    public void listar(View l){
        Intent ir = new Intent(this, TelaBiblioteca.class);
        startActivity(ir);
        TelaBiblioteca.biblioteca = this.biblioteca;
    }
}