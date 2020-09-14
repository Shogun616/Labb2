package com.exempel;

public class Favorite extends Books{
    private String favorite;


    public Favorite(int bookId, String title, String year, String genre, double price, String favorite) {
        super(bookId, title, year, genre, price);
        this.favorite = favorite;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(favorite);
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "favorite='" + favorite + '\'' +
                '}';
    }
}


