package com.exempel;

public class Books extends Main{

    protected int bookId;
    private String title;

    public Books() {
    }

    public Books(int bookId, String title){
        this.title = title;
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

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                '}';
    }
}
