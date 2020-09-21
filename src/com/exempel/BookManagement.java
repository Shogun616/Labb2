package com.exempel;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement{

    static Scanner scan = new Scanner(System.in);

    private static ArrayList<Books> books = new ArrayList<>();

    public static void addBook(Books b){
        books.add(b);
    }

    public static void removeBook(String bookId){
        books.removeIf(b -> b.getBookId().equalsIgnoreCase(bookId));
    }

    public static void updateTitle(String bookId, String title){
        for (Books b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setTitle(title);
            }
        }

    }

    public static void updatePrice(String bookId, double price){
        for (Books b: books){
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setPrice(price);
            }
        }
    }

    public static void viewBook(){
        for (Books b: books){
            System.out.println(b);
        }

        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    public static void showTitle(String title){
        for(Books b: books){
            if(b.getTitle().equalsIgnoreCase(title)){
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

    public static void showHorrorList(){
        for (Books b: books){
            if(b instanceof Horror){
                System.out.println(b);
            }
        }
    }

    public static void showHistoryList(){
        for (Books b: books){
            if(b instanceof History){
                System.out.println(b);
            }
        }
    }

    public static void showApocalypseList(){
        for (Books b: books){
            if(b instanceof Apocalypse){
                System.out.println(b);
            }
        }
    }

    public static void showFantasyList(){
        for (Books b: books){
            if(b instanceof Fantasy){
                System.out.println(b);
            }
        }
    }

    public static void showRomanceList(){
        for (Books b: books){
            if(b instanceof Romance){
                System.out.println(b);
            }
        }
    }

    public static void updatePrice() {
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New Price: ");
        double price = scan.nextDouble();

        BookManagement.updatePrice(bookId, price);
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    public static void addBook(){
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

        Books b = new Books(bookId, title, author, year, genre, price);

        BookManagement.addBook(b);
        System.out.println("A new book has been added on the list");
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    public static void updateTitle(){
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("new Title: ");
        String title = scan.nextLine();

        BookManagement.updateTitle(bookId, title);
        System.out.println("Update complete");
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();

    }

    public static void removeBook(){
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        BookManagement.removeBook(bookId);
        System.out.println("Book Removed");
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    public static void showTitle() {
        System.out.println("Title: ");
        String title = scan.nextLine();

        BookManagement.showTitle(title);
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    public static void showPrice() {
        System.out.println("Price: ");
        double price = scan.nextDouble();

        showPrice(price);
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    public static void updateHorrorList(String bookId, String horrorGenre){
        for (Books b: books){
            if(b.getBookId().equalsIgnoreCase(bookId)){
                if(b instanceof Horror){
                    ((Horror) b).setHorrorGenre(horrorGenre);
                }
            }
        }
    }

    public static void updateHistoryList(String bookId, String historyGenre){
        for (Books b: books){
            if(b.getBookId().equalsIgnoreCase(bookId)){
                if(b instanceof History){
                    ((History) b).setHistoryGenre(historyGenre);
                }
            }
        }
    }

    public static void updateFantasyList(String bookId, String fantasyGenre){
        for (Books b: books){
            if(b.getBookId().equalsIgnoreCase(bookId)){
                if(b instanceof Fantasy){
                    ((Fantasy) b).setFantasyGenre(fantasyGenre);
                }
            }
        }
    }

    public static void updateApocalypseList(String bookId, String apocalypseGenre){
        for (Books b: books){

            if(b.getBookId().equalsIgnoreCase(bookId)){

                if(b instanceof Apocalypse){
                    ((Apocalypse) b).setApocalypseGenre(apocalypseGenre);
                }
            }
        }
    }

    public static void updateRomanceList(String bookId, String romanceGenre){
        for (Books b: books){

            if(b.getBookId().equalsIgnoreCase(bookId)){
                if(b instanceof Romance){
                    ((Romance) b).setRomanceGenre(romanceGenre);
                }
            }
        }
    }

    public static void applyFavorite(String bookId){



    }

    public static void displayFavorite(){


    }
}


