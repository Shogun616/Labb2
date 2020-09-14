package com.exempel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    //static ArrayList<Books> bookStores = new ArrayList<>(10);
    //static ArrayList<Author> authors = new ArrayList<>(10);

    static Books[] books = new Books[5];
    static Author[] authors = new Author[5];

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
        System.out.println("5. Show Book By Title");
        System.out.println("6. Show Author");
        System.out.println("7. Update Author");
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

            case 6:
                showAuthor();
                break;

            case 7:
                updateAuthor();
                break;

            case 8:
                addFavorite();
                break;

            case 9:
                removeFavorite();
                break;

            default:
                System.out.println("Invalid command! Try again!");

        }
    }

    private static void addFavorite() {
    }

    private static void removeFavorite() {
    }

    private static void showAuthor() {

        System.out.println("Authors name: ");
        String auth = scan.nextLine();

        for (int i = 0; i < counter; i++) {
            if(authors[i].getAuthor().equals(auth)){
                System.out.println(authors[i]);
                System.out.println(authors[i].getDebut());
                System.out.println(authors[i].getBibliography());
            }
        }
    }

    private static void updateAuthor() {

        System.out.print("Book Id: ");
        int bId = scan.nextInt();
        scan.nextLine();

        System.out.print("New Author: ");
        String auth = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bId){

                authors[i].setAuthor(auth);
            }
        }

        System.out.print("New Debut: ");
        String dbt = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bId){

                authors[i].setDebut(dbt);
            }
        }

        System.out.print("New Bibliography: ");
        String bib = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bId){

                authors[i].setBibliography(bib);
            }
        }
    }

    private static void showBookByTitle() {

        System.out.println("Title: ");
        String title = scan.nextLine();

        for (int i = 0; i < counter; i++) {
            if(books[i].getTitle().equals(title)){
                System.out.println(books[i]);
            }
        }
    }

    public static void addBook(){

        System.out.println("id: ");
        int bookId = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bookId){

                books[i].setBookId(bookId);
            }
        }

        System.out.println("title: ");
        String title = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getTitle().equals(title)){

                books[i].setTitle(title);
            }
        }

        System.out.println("Author: ");
        String author = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(authors[i].getAuthor().equals(author)){

                authors[i].setAuthor(author);
            }
        }

        System.out.println("Genre: ");
        String genre = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getGenre().equals(genre)){

                books[i].setGenre(genre);
            }
        }

        System.out.println("Year: ");
        String year = scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getYear().equals(year)){

                books[i].setYear(year);
            }
        }

        System.out.println("Price: ");
        double price = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getPrice() == price){

                books[i].setPrice(price);
            }
        }

        Books b = new Books();
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

        System.out.print("Book Id: ");
        int id = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < counter; i++) {

            if(books[i].getBookId() == bId){

                books[i].setBookId(id);
            }
        }

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

                authors[i].setAuthor(auth);
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

    private static void fillMockDB() {

        Books b1 = new Books(1, "Dracula","1897", " Gothic Horror", 10);
        books[counter] = b1;
        counter++;

        Books b2 = new Books(2, "The Dark Tower: The Gunslinger", "1982", "Fantasy/Western", 10);
        books[counter] = b2;
        counter++;

        Books b3 = new Books(3, "The Man In The High Castle", "1962", "Alternative History", 10);
        books[counter] = b3;
        counter++;

        Books b4 = new Books(4, "Metro 2033", "2002", "Post-Apocalyptic", 10);
        books[counter] = b4;
        counter++;

        Books b5 = new Books(5, "Pride And Prejudice", "1813", "Romance", 10);
        books[counter] = b5;
        counter++;

        Author a1 = new Author(1, "Dracula,", "1897", "Bram Stoker", 10, "Bram Stoker", "1875", "12");
        authors[counter] = a1;
        counter++;

        Author a2 = new Author(2, "The Dark Tower: The Gunslinger", "1982", "Fantasy/Western", 10, "Stephen King", "1974", "62");
        authors[counter] = a2;
        counter++;

        Author a3 = new Author(3, "The Man In The High Castle", "1962", "Alternative History", 10, "Philip K. Dick", "1950", "49");
        authors[counter] = a3;
        counter++;

        Author a4 = new Author(4, "Metro 2033", "2002", "Post-Apocalyptic", 10, "Bram Stoker", "2001", "7");
        authors[counter] = a4;
        counter++;

        Author a5 = new Author(5, "Pride And Prejudice", "1813", "Romance", 10, "Jane Austen", "1787", "7");
        authors[counter] = a5;
        counter++;

    }

    public static void main(String[] args) {

       fillMockDB();

        while (repeat){
            menu();
        }

    }
}
