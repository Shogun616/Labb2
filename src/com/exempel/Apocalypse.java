package com.exempel;

public class Apocalypse extends Books{

    private String apocalypseGenre;

    public Apocalypse(String bookId, String title, String author, String year, String genre, double price) {
        super(bookId, title, author, year, genre, price);
        this.apocalypseGenre = apocalypseGenre;
    }

    public String getApocalypseGenre() {
        return apocalypseGenre;
    }

    public void setApocalypseGenre(String apocalypseGenre) {
        this.apocalypseGenre = apocalypseGenre;
    }
}
