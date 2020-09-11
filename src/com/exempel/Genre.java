package com.exempel;

public class Genre extends Books{

    private int genreId;
    private String genre;

    public Genre(int bookId, String title, int genreId, String genre) {
        super(bookId, title);
        this.genreId = genreId;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", genre='" + genre + '\'' +
                '}';
    }
}



