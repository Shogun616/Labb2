package com.exempel;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement{

    static Scanner scan = new Scanner(System.in);

    static Books[] bookDB = new Books[10];
    static int counter = 0;

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

    public static void updateGenre(String bookId, String genre){

        for (Books b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setGenre(genre);
            }
        }
    }

    public static void updateAuthor(String bookId, String author){

        for (Books b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setAuthor(author);
            }
        }
    }

    public static void updateYear(String bookId, String year){

        for (Books b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setYear(year);
            }
        }
    }

    public static void viewBook(){

        for(Books b: books){
            System.out.println(b);
        }
    }

    public static void showTitle(String title){

        for(Books b: books){
            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println(b);
            }
        }
    }

    public static void showAuthor(String author){

        for (Books b: books){
            if (b.getAuthor().equalsIgnoreCase(author)){
                System.out.println(b);
            }
        }
    }

    public static void showYear(String year){

        for (Books b: books){
            if (b.getYear().equalsIgnoreCase(year)){
                System.out.println(b);
            }
        }
    }

    public static void showGenre(String genre){

        for (Books b: books){
            if (b.getGenre().equalsIgnoreCase(genre)){
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

    public static void fillMockDB() {
        Horror h1 = new Horror("13467", "Dracula", "Bram Stoker", "1897", "Horror", 100, "Gothic Horror");
        bookDB[counter] = h1;
        counter++;

        Fantasy f1 = new Fantasy("59846", "The Dark Tower: The Gunslinger", "Stephen King", "1982", "Fantasy", 150, "Fantasy/Western");
        bookDB[counter] = f1;
        counter++;

        History y1 = new History("29461", "The Man In The High Castle", "Philip K. Dick", "1962", "History", 120, "Alternative History");
        bookDB[counter] = y1;
        counter++;

        Apocalypse a1 = new Apocalypse("30679", "Metro 2033", "Dmitry Glukhovsky", "2005", "Apocalyptic", 180, "Post-Apocalypse");
        bookDB[counter] = a1;
        counter++;

        Romance r1 = new Romance("50314", "Pride And Prejudice", "Jane Austin", "1813", "Romance", 110, "Romance");
        bookDB[counter] = r1;
        counter++;
    }

    public static void updateYear(){

        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.println("New Year: ");
        String year = scan.nextLine();

        BookManagement.updateYear(bookId, year);
    }

    public static void updateGenre(){

        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.println("New Genre: ");
        String genre = scan.nextLine();

        BookManagement.updateGenre(bookId, genre);
    }

    public static void updateAuthor(){

        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.println("New Author: ");
        String author = scan.nextLine();

        BookManagement.updateAuthor(bookId, author);
    }

    public static void updatePrice() {

        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.println("New Price: ");
        double price = scan.nextDouble();

        BookManagement.updatePrice(bookId, price);
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
        System.out.println("A new book has been added on the list");
    }

    public static void updateTitle(){

        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.println("new Title: ");
        String title = scan.nextLine();

        BookManagement.updateTitle(bookId, title);
        System.out.println("Update complete");

    }

    public static void removeBook(){

        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        BookManagement.removeBook(bookId);
        System.out.println("Book Removed");
    }

    public static void showTitle() {

        System.out.println("Title: ");
        String title = scan.nextLine();

        BookManagement.showTitle(title);
    }

    public static void showYear() {

        System.out.println("Year: ");
        String year = scan.nextLine();

        BookManagement.showYear(year);
    }

    public static void showPrice() {

        System.out.println("Price: ");
        double price = scan.nextDouble();

        BookManagement.showPrice(price);
    }

    public static void showGenre() {

        System.out.println("Genre: ");
        String genre = scan.nextLine();

        BookManagement.showGenre(genre);
    }

    public static void showAuthor() {

        System.out.println("Authors Name: ");
        String author = scan.nextLine();

        BookManagement.showAuthor(author);
    }
}


