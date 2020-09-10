package com.exempel;

public class Books {

    protected int bookId;
    private String title;
    private String author;
    private String genre;
    private String year;
    private double price;

    public Books() {
    }

    public Books(int bookId, String title, String author, String genre, String year, double price){

        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Price can not have a negative value");
        }

        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.bookId = bookId;

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }else {
            System.out.println("The Price that you added have negative values, please try again!");
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "books{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                '}';
    }
}
