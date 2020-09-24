package com.exempel;

import java.util.Scanner;

public class Main{

    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);

   public static  void options(){

       String decision;

        boolean exit = false;

        while (!exit) {
            decision = scan.nextLine();

            if (decision.equalsIgnoreCase("no")) {
                exit = true;
                menu();
            } else if (decision.equalsIgnoreCase("yes")) {
                exit = true;
            }
        }
    }

    public static void menu() {
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        System.out.println("              BookStore              ");
        System.out.println("======================================");
        System.out.println("              Main Menu             ");
        System.out.println("======================================");
        System.out.println("1. Add Book");
        System.out.println("2. Show Book");
        System.out.println("3. Delete Book");
        System.out.println();
        System.out.println("4. update Author");
        System.out.println("5. Update title");
        System.out.println("6. Update Price");
        System.out.println();
        System.out.println("7. Show Author");
        System.out.println("8. Show Title");
        System.out.println("9. Show Price");
        System.out.println();
        System.out.println("10. Add Apocalypse List");
        System.out.println("11. Add Fantasy List");
        System.out.println("12. Add History List");
        System.out.println("13. Add Horror List");
        System.out.println("14. Add Romance List");
        System.out.println();
        System.out.println("15. Show Apocalypse List");
        System.out.println("16. Show Fantasy List");
        System.out.println("17. Show History List");
        System.out.println("18. Show Horror List");
        System.out.println("19. Show Romance List");
        System.out.println();
        System.out.println("20. Update Apocalypse List");
        System.out.println("21. Update Fantasy List");
        System.out.println("22. Update History List");
        System.out.println("23. Update Horror List");
        System.out.println("24. Update Romance List");
        System.out.println();
        System.out.println("25. Add Favorite");
        System.out.println("26. Show Favorite");
        System.out.println("27. Remove Favorite");
        System.out.println("0.  Exit");

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
                BookManagement.addBook();
                break;
            case 2:
                BookManagement.viewBook();
                break;
            case 3:
                BookManagement.removeBook();
                break;
            case 4:
                BookManagement.updateBookByAuthor();
                break;
            case 5:
                BookManagement.updateBookByTitle();
                break;
            case 6:
                BookManagement.updateBookByPrice();
            case 7:
                BookManagement.displayBookByAuthor();
                break;
            case 8:
                BookManagement.displayBookByTitle();
                break;
            case 9:
                BookManagement.displayBookByPrice();
                break;
            case 10:
                BookManagement.addApocalypseBook();
                break;
            case 11:
                BookManagement.addFantasyBook();
            case 12:
                BookManagement.addHistoryBook();
                break;
            case 13:
                BookManagement.addHorrorBook();
                break;
            case 14:
                BookManagement.addRomanceBook();
            case 15:
                BookManagement.showApocalypseList();
                break;
            case 16:
                BookManagement.showFantasyList();
                break;
            case 17:
                BookManagement.showHistoryList();
                break;
            case 18:
                BookManagement.showHorrorList();
                break;
            case 19:
                BookManagement.showRomanceList();
                break;
            case 20:
                updateApocalypseBook();
                break;
            case 21:
                updateFantasyBook();
                break;
            case 22:
                updateHistoryBook();
                break;
            case 23:
                updateHorrorBook();
                break;
            case 24:
                updateRomanceBook();
                break;
            case 25:
                addFavoriteBook();
                break;
            case 26:
                showFavorite();
                break;
            case 27:
                deleteFavoriteBook();
                break;
            default:
                System.out.println("Invalid command! Try again!");
        }
    }

    private static void addFavoriteBook(){
        System.out.println("Please insert new favorite");
        System.out.print("BookId: ");
        String bookId = scan.nextLine();

        BookManagement.applyFavorite(bookId);
    }

    private static void showFavorite(){
       BookManagement.displayFavorite();
    }

    private static void deleteFavoriteBook() {
        System.out.println("Which favorite do you want to remove");
        System.out.print("BookId: ");
        String bookId = scan.nextLine();

        BookManagement.removeFavorite(bookId);
    }

    private static void updateHorrorBook(){
        System.out.println("Please add the new data");
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String horrorGenre = scan.nextLine();

        BookManagement.updateHorrorBook(bookId, horrorGenre);
        Main.menu();
    }

    private static void updateHistoryBook(){
        System.out.println("Please add the new data");
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String historyGenre = scan.nextLine();

        BookManagement.updateHistoryBook(bookId, historyGenre);
        Main.menu();
    }

    private static void updateApocalypseBook(){
        System.out.println("Please add the new data");
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String apocalypseGenre = scan.nextLine();

        BookManagement.updateApocalypseBook(bookId, apocalypseGenre);
        Main.menu();
    }

    private static void updateFantasyBook(){
        System.out.println("Please add the new data");
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String fantasyGenre = scan.nextLine();

        BookManagement.updateFantasyBook(bookId, fantasyGenre);
        Main.menu();
    }

    private static void updateRomanceBook(){
        System.out.println("Please add the new data");
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String romanceGenre = scan.nextLine();

        BookManagement.updateRomanceBook(bookId,romanceGenre);
        Main.menu();
    }

    public static void main(String[] args) {
        while (repeat){
            menu();
        }
    }

}
