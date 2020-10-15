package com.exempel;

public class Book {

    private String bookId;
    private String title;
    private String author;
    private final String year;
    private final String genre;
    private double price;
    private boolean favorite = false;

    public boolean isFavorite(){
        return favorite;
    }

    public void setFavorite(boolean favorite){
        this.favorite = favorite;
    }

    public Book(String bookId, String title, String author, String year, String genre, double price){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;

        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Price can not have a negative value");
        }
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "Bookid:" + bookId + ", Title:" + title + ", Author:" + author +", Year:" + year + ", Genre:" + genre + ", Price:" + price;
    }
}