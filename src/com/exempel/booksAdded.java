package com.exempel;

public class booksAdded {

    protected int bookId;
    private String title;
    private String author;
    private String genre;
    private String year;
    private double price;

    private static String storeName = "Book ";

    public booksAdded() {
    }

    public booksAdded( int bookId, String title, String author, String genre, String year, double price){

        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Price can not have a negative value");
        }

        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }else {
            System.out.println("The price that you added have a negative value, please try again");
        }
    }

    @Override
    public String toString() {
        return "booksAdded{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                '}';
    }
}
