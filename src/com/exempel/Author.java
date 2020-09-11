package com.exempel;

public class Author extends Books{

    private int authorId;
    private String author;
    private String debut;
    private String bibliography;

    public Author(int bookId, String title, int authorId, String author, String debut, String bibliography) {
        super(bookId, title);
        this.authorId = authorId;
        this.author = author;
        this.debut = debut;
        this.bibliography = bibliography;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
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
                "authorId=" + authorId +
                ", author='" + author + '\'' +
                ", debut='" + debut + '\'' +
                ", bibliography='" + bibliography + '\'' +
                '}';
    }
}
