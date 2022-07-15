package com.example.aularecycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {
    Context context;
    ArrayList<Livro> lista;
    Adaptador.onItemClickListener listener;

    public Adaptador(Context context, ArrayList<Livro> lista, onItemClickListener listener) {
        this.context = context;
        this.lista = lista;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Adaptador.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);
        return new Adaptador.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.MyViewHolder holder, int position) {
         Livro l = lista.get(position);
         holder.titulo.setText(l.titulo);
         holder.isbn.setText(l.isbn);
         holder.autor.setText(l.autor);
         holder.sinopse.setText(l.sinopse);
         holder.classificacao.setText(l.classEdu);
         holder.genero.setText(l.genero);
         holder.itemView.setOnClickListener(view ->{
             listener.onItemcClick(l);
         });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public interface onItemClickListener {
        void onItemcClick(Livro livro);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titulo, autor, genero, classificacao, sinopse, isbn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tituloCard);
            autor = itemView.findViewById(R.id.autorCard);
            genero = itemView.findViewById(R.id.generoCard);
            classificacao = itemView.findViewById(R.id.classEduCard);
            sinopse = itemView.findViewById(R.id.sinopseCard);
            isbn = itemView.findViewById(R.id.isbnCard);
        }
    }
}