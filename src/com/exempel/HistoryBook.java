package com.exempel;

public class HistoryBook extends Book {

    private String historyGenre;

    public HistoryBook(String bookId, String title, String author, String year, String genre, double price, String historyGenre) {
        super(bookId, title, author, year, genre, price);
        this.historyGenre = historyGenre;
    }

    public String getHistoryGenre() {
        return historyGenre;
    }

    public void setHistoryGenre(String historyGenre) {
        this.historyGenre = historyGenre;
    }

    @Override
    public String toString(){
        return super.toString()+ " History Genre: " + historyGenre;
    }
}
