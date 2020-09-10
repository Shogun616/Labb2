package com.exempel;

import java.util.Scanner;

public class Main extends Books{

    static Books[] books = new Books[10];
    static boolean repeat = true;
    static String decision;
    static Scanner scan = new Scanner(System.in);
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

        System.out.println();
        System.out.println("              BookStore              ");
        System.out.println("======================================");
        System.out.println("              Main Menu             ");
        System.out.println("======================================");
        System.out.println("1. Add Book");
        System.out.println("2. Show Book");
        System.out.println("3. Update Book");
        System.out.println("4. Delete Book");
        System.out.println("5. Show Book by id");
        System.out.println("6. Show Book by Genre");
        System.out.println("7. Show Book by Author");
        System.out.println("8. Add Favorite");
        System.out.println("9. Show Favorite");
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
                showBookById();
                break;

            case 6:
                showBookByGenre();
                break;

            case 7:
                showBookByAuthor();
                break;

            default:
                System.out.println("Invalid command! Try again!");

        }
    }

    private static void showBookByAuthor() {
        System.out.println("Author: ");
        String auth = scan.nextLine();

        for (int i = 0; i < counter; i++) {
            if(books[i].getAuthor().equals(auth)){
                System.out.println(books[i]);
            }
        }
    }

    private static void showBookByGenre() {
        System.out.println("Genre: ");
        String gnr = scan.nextLine();

        for (int i = 0; i < counter; i++) {
            if(books[i].getGenre().equals(gnr)){
                System.out.println(books[i]);
            }
        }
    }

    private static void showBookById() {
        System.out.println("Id:");
        int id = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if (books[i].getBookId() == id){

                System.out.println(books[i]);

            }
        }
    }

    private static void fillMockDB() {
       Books b1 = new Books(1, "Dracula", "Bram Stoker", "Horror", "1897", 10);
       books[counter] = b1;
       counter++;

       Books b2 = new Books(2, "The Dark Tower: The Gunslinger", "Stephen King", "Fantasy", "1982", 10);
       books[counter] = b2;
       counter++;

       Books b3 = new Books(3, "The Man In The High Castle", "Philip K. Dick", "Alternate History", "1962", 10);
       books[counter] = b3;
       counter++;

       Books b4 = new Books(4, "Metro 2033", "Dmitry Glukhovsky", "Post-Apocalyptic", "2005", 10);
       books[counter] = b4;
       counter++;

       Books b5 = new Books(5, "Pride And Prejudice", "Jane Austin", "Romance", "1813", 10);
       books[counter] = b5;
       counter++;
    }

    public static void addBook(){

        System.out.println("id: ");
        int bookId = scan.nextInt();
        scan.nextLine();

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

        Books b = new Books(bookId, title, author, genre, year, price);
        if (books.length == counter){

            Books[] temp = new Books[books.length * 2];

            System.arraycopy(books, 0, temp, 0, books.length);

            books = temp;
        }
        books[counter] = b;
        counter++;
    }

    public static void removeBook(){

        System.out.print("Book Id: ");
        int bookId = scan.nextInt();

        for (int i = 0; i < counter; i++) {

           if( books[i].getBookId() == bookId){

               books[i] = books[counter - 1];
               books[counter - 1] = null;
               counter--;
           }
        }
    }

    public static void viewBook(){
        for (int i = 0; i < counter; i++) {

            System.out.println(books[i]);
        }
    }

    public static void updateBook(){

        System.out.print("Book Id: ");
        int bId = scan.nextInt();
        scan.nextLine();

        System.out.print("New Title: ");
        String title = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bId){

                books[i].setTitle(title);
            }
        }

        System.out.print("New Author: ");
        String auth = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bId){

                books[i].setAuthor(auth);
            }
        }

        System.out.print("New Genre: ");
        String gnr = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bId){

                books[i].setGenre(gnr);
            }
        }

        System.out.print("New Year: ");
        String year = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bId){

                books[i].setYear(year);
            }
        }

        System.out.print("New Price:");
        double price = scan.nextDouble();
        scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bId){

                books[i].setPrice(price);
            }
        }
    }

    public static void main(String[] args) {

        fillMockDB();

        while (repeat){
            menu();
        }

    }
}
