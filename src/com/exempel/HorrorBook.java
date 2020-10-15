package com.exempel;

public class HorrorBook extends Book {

    private final String subGenre;

    public HorrorBook(String bookId, String title, String author, String year, String genre, double price, String subGenre) {
        super(bookId, title, author, year, genre, price);
        this.subGenre = subGenre;
    }

    @Override
    public String toString(){
        return super.toString()+ " SubGenre: " + subGenre;
    }
}
