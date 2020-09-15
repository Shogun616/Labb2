package com.exempel;

import java.util.ArrayList;

public class BookManagement{

    private static final ArrayList<Books> books = new ArrayList<>();

    public static void addBook(Books b){

        books.add(b);
    }

    public static void removeBook(String bookId){

        books.removeIf(b -> b.getBookId().equalsIgnoreCase(bookId));
    }

    public static void updateBook(String bookId, String title, String author, String genre, String year, double price){

        for (Books b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setTitle(title);
                b.setAuthor(author);
                b.setGenre(genre);
                b.setYear(year);
                b.setPrice(price);
            }
        }

    }

    public static void viewBook(){

        for(Books b: books){
            System.out.println(b);
        }
    }

    public static void showTitle(String title){

        for(Books b: books){
            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println(b);
            }
        }
    }

    public static void showAuthor(String author){

        for (Books b: books){
            if (b.getAuthor().equalsIgnoreCase(author)){
                System.out.println(b);
            }
        }
    }

    public static void showYear(String year){

        for (Books b: books){
            if (b.getYear().equalsIgnoreCase(year)){
                System.out.println(b);
            }
        }
    }

    public static void showGenre(String genre){

        for (Books b: books){
            if (b.getGenre().equalsIgnoreCase(genre)){
                System.out.println(b);
            }
        }
    }

    public static void showPrice(double price){

        for (Books b: books){
            if (b.getPrice()==(price)){
                System.out.println(b);
            }
        }
    }
}


