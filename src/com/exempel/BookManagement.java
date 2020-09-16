package com.exempel;

import java.util.ArrayList;

public class BookManagement{

    private static final ArrayList<Books> books = new ArrayList<>();

    private static final ArrayList<Romance> romances = new ArrayList<>();

    private static final ArrayList<Apocalypse> apocalypses = new ArrayList<>();

    private static final ArrayList<History> histories = new ArrayList<>();

    private static final ArrayList<Fantasy> fantasies = new ArrayList<>();

    private static final ArrayList<Horror> horrors = new ArrayList<>();

    public static void addBook(Books b){

        books.add(b);
    }

    public static void removeBook(String bookId){

        books.removeIf(b -> b.getBookId().equalsIgnoreCase(bookId));
    }

    public static void updateBook(String bookId, String title, String author, String genre, String year, double price){

        for (Books b: books) {
            if(b.getBookId().equalsIgnoreCase(bookId)){
                b.setBookId(bookId);
                b.setTitle(title);
                b.setAuthor(author);
                b.setGenre(genre);
                b.setYear(year);
                b.setPrice(price);
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

    public static void listOfGenre(String romanceGenre, String horrorGenre, String apocalypseGenre, String fantasyGenre, String historyGenre){
        for (Romance r: romances){
            if(r.getRomanceGenre().equalsIgnoreCase(romanceGenre)){
                System.out.println(r);
            }
        }
        for (Horror h: horrors){
            if(h.getHorrorGenre().equalsIgnoreCase(horrorGenre)){
                System.out.println(h);
            }
        }
        for (Apocalypse a: apocalypses){
            if(a.getApocalypseGenre().equalsIgnoreCase(apocalypseGenre)){
                System.out.println(a);
            }
        }
        for (Fantasy f: fantasies){
            if(f.getFantasyGenre().equalsIgnoreCase(fantasyGenre)){
                System.out.println(f);
            }
        }
        for (History y: histories){
            if(y.getHistoryGenre().equalsIgnoreCase(historyGenre)){
                System.out.println(y);
            }
        }
    }

    public static void updateListOfGenre(String romanceGenre, String horrorGenre, String apocalypseGenre, String fantasyGenre, String historyGenre){

        for (Romance r: romances){
            if(r.getRomanceGenre().equalsIgnoreCase(romanceGenre)){
                r.setRomanceGenre(romanceGenre);
            }
        }

        for (Horror h: horrors){
            if(h.getHorrorGenre().equalsIgnoreCase(horrorGenre)){
                h.setHorrorGenre(horrorGenre);
            }
        }

        for (Apocalypse a: apocalypses){
            if(a.getApocalypseGenre().equalsIgnoreCase(apocalypseGenre)){
                a.setApocalypseGenre(apocalypseGenre);
            }
        }

        for (Fantasy f: fantasies){
            if(f.getFantasyGenre().equalsIgnoreCase(fantasyGenre)){
                f.setFantasyGenre(fantasyGenre);
            }
        }

        for (History y: histories){
            if(y.getHistoryGenre().equalsIgnoreCase(historyGenre)){
                y.setHistoryGenre(historyGenre);
            }
        }
    }
}


