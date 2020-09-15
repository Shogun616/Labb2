package com.exempel;

import java.util.ArrayList;

public class BookManagement{

    private static ArrayList<Books> books = new ArrayList<>();


    public static void addBook(Books b){

        books.add(b);
    }

    public static void removeBook(String bookId){

        books.removeIf(b -> b.getBookId().equalsIgnoreCase(bookId));
    }

    public static void updateBook(String bookId, String title, String author, String genre, String year, double price){

        for (Books b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setPrice(price);
                b.setTitle(title);
                b.setTitle(bookId);
                b.setTitle(author);
                b.setTitle(year);
                b.setTitle(genre);
            }
        }

    }

    public static void viewBook(){

        for(Books b: books){
            System.out.println(b);
        }
    }

    public static void showBookByTitle(String title){
        for(Books b: books){
            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println(b);
            }
        }
    }
}
