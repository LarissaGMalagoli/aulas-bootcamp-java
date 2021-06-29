package com.meli.aula03.TMAula2Exer2;

public class Book {
    private String titulo;
    private int isbn;
    private String autor;

    public void devolver(String nomeLivro){
        System.out.println(nomeLivro + " Devolvido!");
    }

    public void emprestado(String nomeLivro){
        System.out.println(nomeLivro + " Emprestado!");
    }


    public Book(String titulo, int isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", isbn=" + isbn +
                ", autor='" + autor + '\'' +
                '}';
    }
}
