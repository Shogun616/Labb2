package com.exempel;

import java.util.Scanner;

public class Main{

    static boolean repeat = true;
    static String decision;
    static Scanner scan = new Scanner(System.in);

    static Books[] bookDB = new Books[10];
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
        System.out.println("7. Show Genre");
        System.out.println("8. Show Price");
        System.out.println("9. Show Year");
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
            case 6:
                showAuthor();
                break;
            case 7:
                showGenre();
                break;
            case 8:
                showPrice();
                break;
            case 9:
                showYear();
                break;
            default:
                System.out.println("Invalid command! Try again!");

        }
    }

    public static void addBook(){

        System.out.println("id: ");
        String bookId = scan.nextLine();

        System.out.println("title: ");
        String title = scan.nextLine();

        System.out.println("Author: ");
        String author = scan.nextLine();

        System.out.println("Year: ");
        String year = scan.nextLine();

        System.out.println("Genre: ");
        String genre = scan.nextLine();

        System.out.println("Price: ");
        double price = scan.nextDouble();

        Books b = new Books(bookId, title, author, year, genre, price);

        BookManagement.addBook(b);
    }

    public static void viewBook(){

        BookManagement.viewBook();

        for (int i = 0; i < counter; i++) {

            System.out.println(bookDB[i]);
        }

    }

    public static void updateBook(){

        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.println("new Title: ");
        String title = scan.nextLine();

        System.out.println("New Author: ");
        String author = scan.nextLine();

        System.out.println("New Genre: ");
        String genre = scan.nextLine();

        System.out.println("New Year: ");
        String year = scan.nextLine();

        System.out.println("New Price: ");
        double price = scan.nextDouble();

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

        BookManagement.showTitle(title);

        for (int i = 0; i < counter; i++) {

            System.out.println(bookDB[i]);
        }
    }

    private static void fillMockDB() {
        Books b1 = new Books("13467", "Dracula", "Bram Stoker", "1897", "Gothic Horror", 100);
        bookDB[counter] = b1;
        counter++;

        Books b2 = new Books("59846", "The Dark Tower: The Gunslinger", "Stephen King", "1982", "Fantasy", 150);
        bookDB[counter] = b2;
        counter++;

        Books b3 = new Books("29461", "The Man In The High Castle", "Philip K. Dick", "1962", "Alternative History", 120);
        bookDB[counter] = b3;
        counter++;

        Books b4 = new Books("30679", "Metro 2033", "Dmitry Glukhovsky", "2005", "Post-Apocalyptic", 180);
        bookDB[counter] = b4;
        counter++;

        Books b5 = new Books("50314", "Pride And Prejudice", "Jane Austin", "1813", "Romance", 110);
        bookDB[counter] = b5;
        counter++;
    }

    private static void showYear() {

        System.out.println("Year: ");
        String year = scan.nextLine();

        BookManagement.showYear(year);
    }

    private static void showPrice() {

        System.out.println("Price: ");
        double price = scan.nextDouble();

        BookManagement.showPrice(price);
    }

    private static void showGenre() {

        System.out.println("Genre: ");
        String genre = scan.nextLine();

        BookManagement.showGenre(genre);
    }

    private static void showAuthor() {

        System.out.println("Authors Name: ");
        String author = scan.nextLine();

       BookManagement.showAuthor(author);
    }

    public static void main(String[] args) {

       fillMockDB();

        while (repeat){
            menu();
        }
    }
}
