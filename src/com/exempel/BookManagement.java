package com.exempel;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement{

    static Scanner scan = new Scanner(System.in);

    private static final ArrayList<Book> books = new ArrayList<>();
    private static final ArrayList<HorrorBook> horrorBooks = new ArrayList<>();
    private static final ArrayList<Book> historyBooks = new ArrayList<>();
    private static final ArrayList<Book> apocalypseBooks = new ArrayList<>();
    private static final ArrayList<Book> fantasyBooks = new ArrayList<>();
    private static final ArrayList<Book> romanceBooks = new ArrayList<>();


    public static void addBook(Book b){
        books.add(b);
    }

    public static void addApocalypseBook(ApocalypseBook c){
        apocalypseBooks.add(c);
    }

    public static void addHistoryBook(HistoryBook d){
        historyBooks.add(d);
    }

    public static void addHorrorBook(HorrorBook e){
        horrorBooks.add(e);
    }

    public static void addFantasyBook(FantasyBook f){
        fantasyBooks.add(f);
    }

    public static void addRomanceBook(RomanceBook g){
        romanceBooks.add(g);
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

        Book b = new Book(bookId, title, author, year, genre, price);
        ApocalypseBook c = new ApocalypseBook(bookId, title, author, year, genre, price, subgenre);
        HistoryBook d = new HistoryBook(bookId, title, author, year, genre, price, subgenre);
        HorrorBook  e = new HorrorBook(bookId, title, author, year, genre, price, subgenre);
        FantasyBook f = new FantasyBook(bookId, title, author, year, genre, price, subgenre);
        RomanceBook g = new RomanceBook(bookId, title, author, year, genre, price, subgenre);

        BookManagement.addBook(b);
        BookManagement.addApocalypseBook(c);
        BookManagement.addHistoryBook(d);
        BookManagement.addHorrorBook(e);
        BookManagement.addFantasyBook(f);
        BookManagement.addRomanceBook(g);

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