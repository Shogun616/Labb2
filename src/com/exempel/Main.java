package com.exempel;

import java.util.Scanner;

public class Main{

    static boolean repeat = true;
    static String decision;
    static Scanner scan = new Scanner(System.in);

    static Books[] books = new Books[10];
    static int counter = 0;
    
   public static  void options(){

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

        System.out.println();
        System.out.println("              BookStore              ");
        System.out.println("======================================");
        System.out.println("              Main Menu             ");
        System.out.println("======================================");
        System.out.println("1. Add Book");
        System.out.println("2. Show Book");
        System.out.println("3. Update Book");
        System.out.println("4. Delete Book");
        System.out.println("5. Show Book By Title");
        System.out.println("6. Show Author");
        System.out.println("8. Add Favorite");
        System.out.println("9. Remove Favorite");
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
            case 5:
                showBookByTitle();
                break;
            default:
                System.out.println("Invalid command! Try again!");

        }
    }

    public static void main(String[] args) {

       fillMockDB();

        while (repeat){
            menu();
        }
    }

    public static void addBook(){

        System.out.println("id: ");
        String bookId = scan.nextLine();

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

        Books b = new Books(bookId, title, author, genre, year, price);

        BookManagement.addBook(b);
    }

    public static void viewBook(){

       BookManagement.viewBook();

    }

    public static void updateBook(){

        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New Title: ");
        String title = scan.nextLine();

        System.out.println("New Author: ");
        String author = scan.nextLine();

        System.out.print("New Genre: ");
        String genre = scan.nextLine();

        System.out.print("New Year: ");
        String year = scan.nextLine();

        System.out.print("New Price:");
        double price = scan.nextDouble();
        scan.nextLine();

        BookManagement.updateBook(bookId, title, author, genre, year, price);

    }

    public static void removeBook(){

        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        BookManagement.removeBook(bookId);
    }

    private static void showBookByTitle() {

        System.out.println("Title: ");
        String title = scan.nextLine();

        BookManagement.showBookByTitle(title);
    }

    private static void fillMockDB() {
        Books b1 = new Books("13467", "Dracula", "Bram Stoker", "Horror", "1897", 100);
        books[counter] = b1;
        counter++;

        Books b2 = new Books("59846", "The Dark Tower: The Gunslinger", "Stephen King", "Fantasy", "1982", 150);
        books[counter] = b2;
        counter++;

        Books b3 = new Books("29461", "The Man In The High Castle", "Philip K. Dick", "Alternate History", "1962", 120);
        books[counter] = b3;
        counter++;

        Books b4 = new Books("30679", "Metro 2033", "Dmitry Glukhovsky", "Post-Apocalyptic", "2005", 180);
        books[counter] = b4;
        counter++;

        Books b5 = new Books("50314", "Pride And Prejudice", "Jane Austin", "Romance", "1813", 110);
        books[counter] = b5;
        counter++;
    }

}
