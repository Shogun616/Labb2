package com.exempel;

public class FantasyBook extends Book {

    private final String subGenre;

    public FantasyBook(String bookId, String title, String author, String year, String genre, double price, String subGenre) {
        super(bookId, title, author, year, genre, price);
        this.subGenre = subGenre;
    }

    @Override
    public String toString(){
        return super.toString()+ " SubGenre: " + subGenre;
    }
}
