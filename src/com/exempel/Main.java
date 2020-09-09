package com.exempel;

import java.util.Scanner;

public class Main {

    static booksAdded[] books = new booksAdded[10];
    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);
    static String decision;
    static int counter = 0;
    
   public static  void  options(){

        boolean exit = true;

        while (exit) {
            decision = scan.nextLine();

            if (decision.equalsIgnoreCase("no")) {
                exit = false;
                menu();
            } else if (decision.equalsIgnoreCase("yes")) {
                exit = false;
            }
        }
    }

    public static void menu() {

        System.out.println("              BookStore              ");
        System.out.println("======================================");
        System.out.println("              Main Menu             ");
        System.out.println("======================================");
        System.out.println("1. Add Book");
        System.out.println("2. Book Detail");
        System.out.println("3. Update Book");
        System.out.println("4. Delete Book");
        System.out.println("0. Exit");

        System.out.println("\nMake your choice");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {

            case 0:
                System.out.println("Exit? (yes/no)");
                options();
                System.out.println("This program has been terminated!");
                repeat = false;
                break;

            case 1:
                addBook();
                break;

            case 2:
                viewBook();
                break;

            case 3:
                updateBook();
                break;

            case 4:
                removeBook();
                break;

            default:
                System.out.println("Invalid options! Try again!");

        }
    }

   public static void main(String[] args) {

        while (repeat){
            menu();
        }

    }

    public static void addBook(){

        System.out.println("id: ");
        int bookId = scan.nextInt();
        scan.nextInt();

        System.out.println("title: ");
        String title = scan.nextLine();

        System.out.println("Author: ");
        String author = scan.nextLine();

        System.out.println("Genre: ");
        String genre = scan.nextLine();

        System.out.println("Year: ");
        String year = scan.nextLine();

        System.out.println("Price: ");
        double price = scan.nextInt();
        scan.nextLine();

        booksAdded b = new booksAdded(bookId, title, author, genre, year, price);
        books[counter] =b;

    }

    public static void viewBook(){

    }

    public static void updateBook(){

    }

    public static void removeBook(){

    }
}
