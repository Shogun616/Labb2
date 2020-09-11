package com.exempel;

public class Year extends Books {

    private int yearId;
    private String year;

    public Year(int bookId, String title, int yearId, String year) {
        super(bookId, title);
        this.yearId = yearId;
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Year{" +
                "yearId=" + yearId +
                ", year='" + year + '\'' +
                '}';
    }
}
