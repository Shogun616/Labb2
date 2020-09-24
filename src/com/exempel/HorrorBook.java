package com.exempel;

public class HorrorBook extends Book {

    private String horrorGenre;

    public HorrorBook(String bookId, String title, String author, String year, String genre, double price, String horrorGenre) {
        super(bookId, title, author, year, genre, price);
        this.horrorGenre = horrorGenre;
    }

    public String getHorrorGenre() {
        return horrorGenre;
    }

    public void setHorrorGenre(String horrorGenre) {
        this.horrorGenre = horrorGenre;
    }

    @Override
    public String toString(){
        return super.toString()+ " Horror Genre: " + horrorGenre;
    }
}
