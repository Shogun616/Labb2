package com.exempel;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement{

    static Scanner scan = new Scanner(System.in);

    private static final ArrayList<Book> books = new ArrayList<>();
    private static final ArrayList<Book> horrorBooks = new ArrayList<>();
    private static final ArrayList<Book> historyBooks = new ArrayList<>();
    private static final ArrayList<Book> apocalypseBooks = new ArrayList<>();
    private static final ArrayList<Book> fantasyBooks = new ArrayList<>();
    private static final ArrayList<Book> romanceBooks = new ArrayList<>();

    public static void addHorrorBook(HorrorBook b){
        horrorBooks.add(b);
    }

    public static void addHistoryBook(HistoryBook c){
        historyBooks.add(c);
    }

    public static void addApocalypseBook(ApocalypseBook d){
        apocalypseBooks.add(d);
    }

    public static void addFantasyBook(FantasyBook e){
        fantasyBooks.add(e);
    }

    public static void addRomanceBook(RomanceBook f){
        romanceBooks.add(f);
    }

    public static void addBook(Book g){
        books.add(g);
    }

    public static void removeBook(String bookId){
        books.removeIf(b -> b.getBookId().equalsIgnoreCase(bookId));
    }

    public static void updateBookByAuthor(String bookId, String author){
        for (Book b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setAuthor(author);
            }
        }
    }

    public static void updateBookByTitle(String bookId, String title){
        for (Book b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setTitle(title);
            }
        }
    }

    public static void updateBookByPrice(String bookId, double price){
        for (Book b: books){
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setPrice(price);
            }
        }
    }

    public static void viewBook(){
        for (Book b: books){
            System.out.println(b);
        }

    }

    public static void showBookByTitle(String title){
        for(Book b: books){
            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println(b);
            }
        }
    }

    public static void showBookByPrice(double price){
        for (Book b: books){
            if (b.getPrice()==(price)){
                System.out.println(b);
            }
        }
    }

    public static void showBookByAuthor(String author){
        for(Book b: books){
            if(b.getAuthor().equalsIgnoreCase(author)){
                System.out.println(b);
            }
        }
    }

    public static void applyFavorite(String bookId){
        for (Book b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setFavorite(true);
            }
        }
        System.out.println("A new favorite has been added");
        Main.menu();
    }

    public static void displayFavorite(){
        for(Book b: books){
            if(b.isFavorite()){
                System.out.println(b);
            }
        }
    }

    public static void removeFavorite(String bookId){
        for (Book b: books) {
            if (b.getBookId().equalsIgnoreCase(bookId)){
                b.setFavorite(false);
            }
        }
        System.out.println("Favorite Removed");
    }

    public static void addBook(){
        System.out.println("Please add the new book");
        System.out.print("id: ");
        String bookId = scan.nextLine();

        System.out.print("title: ");
        String title = scan.nextLine();

        System.out.print("Author: ");
        String author = scan.nextLine();

        System.out.print("Year: ");
        String year = scan.nextLine();

        System.out.print("Genre: ");
        String genre = scan.nextLine();

        System.out.print("Price: ");
        double price = scan.nextDouble();
        scan.nextLine();

        System.out.print("Subgenre: ");
        String subgenre = scan.nextLine();

        HorrorBook  b = new HorrorBook(bookId, title, author, year, genre, price, subgenre);
        HistoryBook c = new HistoryBook(bookId, title, author, year, genre, price, subgenre);
        ApocalypseBook d = new ApocalypseBook(bookId, title, author, year, genre, price, subgenre);
        FantasyBook e = new FantasyBook(bookId, title, author, year, genre, price, subgenre);
        RomanceBook f = new RomanceBook(bookId, title, author, year, genre, price, subgenre);
        Book g = new Book(bookId, title, author, year, genre, price);

        BookManagement.addHorrorBook(b);
        BookManagement.addHistoryBook(c);
        BookManagement.addApocalypseBook(d);
        BookManagement.addFantasyBook(e);
        BookManagement.addRomanceBook(f);
        BookManagement.addBook(g);
        System.out.println("A new book has been added on the list");
        Main.menu();
    }

    public static void updateBookByTitle(){
        System.out.println("Please add the new data");
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("new Title: ");
        String title = scan.nextLine();

        BookManagement.updateBookByTitle(bookId, title);
        System.out.println("Update complete");
        Main.menu();

    }

    public static void removeBook(){
        System.out.println("Which book do you want removed?");
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        BookManagement.removeBook(bookId);
        System.out.println("Book Removed");
        Main.menu();
    }

    public static void displayBookByTitle() {
        System.out.print("Title: ");
        String title = scan.nextLine();

        BookManagement.showBookByTitle(title);
        Main.menu();
    }

    public static void displayBookByPrice() {
        System.out.print("Price: ");
        double price = scan.nextDouble();

        BookManagement.showBookByPrice(price);
        Main.menu();
    }

    public static void displayBookByAuthor(){
        System.out.print("Author: ");
        String author = scan.nextLine();

        BookManagement.showBookByAuthor(author);
        Main.menu();
    }

    public static void updateBookByAuthor(){
        System.out.println("Please add the new data");
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("new Author: ");
        String author = scan.nextLine();

        BookManagement.updateBookByAuthor(bookId, author);
        System.out.println("Update complete");
        Main.menu();

    }

    public static void updateBookByPrice() {
        System.out.println("Please add the new data");
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New Price: ");
        double price = scan.nextDouble();

        BookManagement.updateBookByPrice(bookId, price);
        System.out.println("Update Complete");
        Main.menu();
    }

    public static void addFavoriteBook(){
        System.out.println("Please insert new favorite");
        System.out.print("BookId: ");
        String bookId = scan.nextLine();

        BookManagement.applyFavorite(bookId);
    }

    public static void showFavorite(){
        BookManagement.displayFavorite();
    }

    public static void deleteFavoriteBook() {
        System.out.println("Which favorite do you want to remove");
        System.out.print("BookId: ");
        String bookId = scan.nextLine();

        BookManagement.removeFavorite(bookId);
    }
}