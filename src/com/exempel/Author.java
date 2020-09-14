package com.exempel;

public class Author extends Books{

    private String author;
    private String debut;
    private String bibliography;

    public Author(int bookId, String title, String year, String genre, double price, String author, String debut, String bibliography) {
        super(bookId, title, year, genre, price);
        this.author = author;
        this.debut = debut;
        this.bibliography = bibliography;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(author);
        System.out.println(debut);
        System.out.println(bibliography);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getBibliography() {
        return bibliography;
    }

    public void setBibliography(String bibliography) {
        this.bibliography = bibliography;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author='" + author + '\'' +
                ", debut='" + debut + '\'' +
                ", bibliography='" + bibliography + '\'' +
                '}';
    }
}
