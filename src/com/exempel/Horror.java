package com.exempel;

public class Horror extends Books{

    private String horrorGenre;

    public Horror(String bookId, String title, String author, String year, String genre, double price, String horrorGenre) {
        super(bookId, title, author, year, genre, price);
        this.horrorGenre = horrorGenre;
    }

    public String getHorrorGenre() {
        return horrorGenre;
    }

    public void setHorrorGenre(String horrorGenre) {
        this.horrorGenre = horrorGenre;
    }
}
