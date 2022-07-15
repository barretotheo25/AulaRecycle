package com.example.aularecycle;

public class Livro {
    String titulo, autor, genero, classEdu, sinopse, isbn;

    public Livro(String titulo, String autor, String genero, String classEdu, String sinopse, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.classEdu = classEdu;
        this.sinopse = sinopse;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClassEdu() {
        return classEdu;
    }

    public void setClassEdu(String classEdu) {
        this.classEdu = classEdu;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
