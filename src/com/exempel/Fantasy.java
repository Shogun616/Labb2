package com.exempel;

public class Fantasy extends Books{

    private String fantasyGenre;

    public Fantasy(String bookId, String title, String author, String year, String genre, double price) {
        super(bookId, title, author, year, genre, price);
        this.fantasyGenre = fantasyGenre;
    }

    public String getFantasyGenre() {
        return fantasyGenre;
    }

    public void setFantasyGenre(String fantasyGenre) {
        this.fantasyGenre = fantasyGenre;
    }
}
