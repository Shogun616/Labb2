package com.exempel;

public class Books{

    private String bookId;
    private String title;
    private String author;
    private String year;
    private String genre;
    private double price;

    public Books(String bookId, String title, String author, String year, String genre, double price){
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
        return "Books{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}
