package com.exempel;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement{

    static Scanner scan = new Scanner(System.in);

    private static final ArrayList<Book> books = new ArrayList<>();

    public static void addBook(Book b){
        books.add(b);
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
        Main.menu();
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

    public static void showHorrorList(){
        for (Book b: books){
            if(b instanceof HorrorBook){
                System.out.println(b);
            }
        }
        Main.menu();
    }

    public static void showHistoryList(){
        for (Book b: books){
            if(b instanceof HistoryBook){
                System.out.println(b);
            }
        }
        Main.menu();
    }

    public static void showApocalypseList(){
        for (Book b: books){
            if(b instanceof ApocalypseBook){
                System.out.println(b);
            }
        }
        Main.menu();
    }

    public static void showFantasyList(){
        for (Book b: books){
            if(b instanceof FantasyBook){
                System.out.println(b);
            }
        }
        Main.menu();
    }

    public static void showRomanceList(){
        for (Book b: books){
            if(b instanceof RomanceBook){
                System.out.println(b);
            }
        }
        Main.menu();
    }

    public static void updateHorrorBook(String bookId, String horrorGenre){
        for (Book b: books){
            if(b.getBookId().equalsIgnoreCase(bookId)){
                if(b instanceof HorrorBook){
                    ((HorrorBook) b).setHorrorGenre(horrorGenre);
                }
            }
        }
        System.out.println("Update Complete");
        Main.menu();
    }

    public static void updateHistoryBook(String bookId, String historyGenre){
        for (Book b: books){
            if(b.getBookId().equalsIgnoreCase(bookId)){
                if(b instanceof HistoryBook){
                    ((HistoryBook) b).setHistoryGenre(historyGenre);
                }
            }
        }
        System.out.println("Update Complete");
        Main.menu();
    }

    public static void updateFantasyBook(String bookId, String fantasyGenre){
        for (Book b: books){
            if(b.getBookId().equalsIgnoreCase(bookId)){
                if(b instanceof FantasyBook){
                    ((FantasyBook) b).setFantasyGenre(fantasyGenre);
                }
            }
        }
        System.out.println("Update Complete");
        Main.menu();
    }

    public static void updateApocalypseBook(String bookId, String apocalypseGenre){
        for (Book b: books){

            if(b.getBookId().equalsIgnoreCase(bookId)){

                if(b instanceof ApocalypseBook){
                    ((ApocalypseBook) b).setApocalypseGenre(apocalypseGenre);
                }
            }
        }
        Main.menu();
    }

    public static void updateRomanceBook(String bookId, String romanceGenre){
        for (Book b: books){

            if(b.getBookId().equalsIgnoreCase(bookId)){
                if(b instanceof RomanceBook){
                    ((RomanceBook) b).setRomanceGenre(romanceGenre);
                }
            }
        }
        System.out.println("Update Complete");
        Main.menu();
    }

    public static void applyFavorite(String bookId){
        //hitta booken
        //ändra värdet på favorit till true.
        for (Book b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setFavorite(true);
            }
        }
    }

    public static void displayFavorite(){
        //loopa igenom och för varje book om värdet på favorit är true skriv ut den

        for(Book b: books){
            if(b.isFavorite()){
                System.out.println(b);
            }
        }

    }

    public static void removeFavorite(String bookId){
        for ( Book b: books) {
            if (b.getBookId().equalsIgnoreCase(bookId)){
                b.setFavorite(false);
            }
        }
        System.out.println("Favorite Removed");
    }

    /*                               */
    public static void HorrorBook(){
        System.out.println("Please insert Horror Book");
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
        String subGenre = scan.nextLine();

        Book b = new HorrorBook(bookId, title, author, year, genre, price, subGenre);

        BookManagement.addBook(b);
        System.out.println("A new book has been added on the list");
        Main.menu();
    }

    public static void HistoryBook(){
        System.out.println("Please insert History Book");
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

        System.out.println("Subgenre: ");
        String subGenre = scan.nextLine();

        Book b = new HistoryBook(bookId, title, author, year, genre, price, subGenre);

        BookManagement.addBook(b);
        System.out.println("A new book has been added on the list");
        Main.menu();
    }

    public static void ApocalypseBook(){
        System.out.println("Please insert Apocalypse Book");
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
        String subGenre = scan.nextLine();

        Book b = new ApocalypseBook(bookId, title, author, year, genre, price, subGenre);

        BookManagement.addBook(b);
        System.out.println("A new book has been added on the list");
        Main.menu();
    }

    public static void FantasyBook(){
        System.out.println("Please insert Fantasy Book");
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
        String subGenre = scan.nextLine();

        Book b = new FantasyBook(bookId, title, author, year, genre, price, subGenre);

        BookManagement.addBook(b);
        System.out.println("A new book has been added on the list");
        Main.menu();
    }

    public static void RomanceBook(){
        System.out.println("Please insert Romance Book");
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
        String subGenre = scan.nextLine();

        Book b = new RomanceBook(bookId, title, author, year, genre, price, subGenre);

        BookManagement.addBook(b);
        System.out.println("A new book has been added on the list");
        Main.menu();
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


        Book b = new Book(bookId, title, author, year, genre, price);

        BookManagement.addBook(b);
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
}




