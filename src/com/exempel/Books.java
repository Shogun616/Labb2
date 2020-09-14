package com.exempel;

public class Books{

    protected int bookId;
    private String title;
    private String year;
    private String genre;
    private double price;

    public Books() {
    }

    public Books(int bookId, String title, String year, String genre, double price){
        this.title = title;
        this.bookId = bookId;
        this.year = year;
        this.genre = genre;

        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Price can not have a negative value");
        }
    }

    public void showInfo(){
        System.out.println(bookId);
        System.out.println(title);
        System.out.println(genre);
        System.out.println(year);
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
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}
