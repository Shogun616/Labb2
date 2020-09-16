package com.exempel;

public class History extends Books{

    private String historyGenre;

    public History(String bookId, String title, String author, String year, String genre, double price, String historyGenre) {
        super(bookId, title, author, year, genre, price);
        this.historyGenre = historyGenre;
    }

    public String getHistoryGenre() {
        return historyGenre;
    }

    public void setHistoryGenre(String historyGenre) {
        this.historyGenre = historyGenre;
    }
}
