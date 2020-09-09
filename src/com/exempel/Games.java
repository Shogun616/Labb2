package com.exempel;

public class Games {

    private int gameId;
    private String title;
    private String publisher;
    private String genre;
    private String year;
    private double price;

    public Games() {
    }

    public Games(int gameId, String title, String publisher, String genre, String year, double price){

        if (price > 0){
            this.price = price;
        } else {
            System.out.println("Price can not have a negative value");
        }

        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.year = year;
        this.gameId = gameId;

    }
}
