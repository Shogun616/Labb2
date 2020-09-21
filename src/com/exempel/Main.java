package com.exempel;

import java.util.Scanner;

public class Main{

    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);

   public static  void options(){

       String decision;

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
        System.out.println("3. Delete Book");
        System.out.println();
        System.out.println("4. Update title");
        System.out.println("5. Update Price");
        System.out.println();
        System.out.println("6.  Show Title");
        System.out.println("7. Show Price");
        System.out.println();
        System.out.println("8. Show Horror List");
        System.out.println("9. Show History List");
        System.out.println("10. Show Apocalypse List");
        System.out.println("11. Show Fantasy List");
        System.out.println("12. Show Romance List");
        System.out.println();
        System.out.println("13. Update Apocalypse List");
        System.out.println("14. Update History List");
        System.out.println("15. Update Horror List");
        System.out.println("16. Update Fantasy List");
        System.out.println("17. Update Romance List");
        System.out.println();
        System.out.println("18: Add Favorite");
        System.out.println("19. Show Favorite");
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
                BookManagement.addBook();
                break;
            case 2:
                BookManagement.viewBook();
                break;
            case 3:
                BookManagement.removeBook();
                break;
            case 4:
                BookManagement.updateTitle();
                break;
            case 5:
                BookManagement.updatePrice();
                break;
            case 6:
                BookManagement.showTitle();
                break;
            case 7:
                BookManagement.showPrice();
                break;
            case 8:
                BookManagement.showHorrorList();
                break;
            case 9:
                BookManagement.showHistoryList();
                break;
            case 10:
                BookManagement.showApocalypseList();
                break;
            case 11:
                BookManagement.showFantasyList();
                break;
            case 12:
                BookManagement.showRomanceList();
                break;
            case 13:
                updateApocalypseList();
                break;
            case 14:
                updateHorrorList();
                break;
            case 15:
                updateHistoryList();
                break;
            case 16:
                updateFantasyList();
                break;
            case 17:
                updateRomanceList();
                break;
            case 18:
                addFavorite();
                break;
            case 19:
                showFavorite();
                break;
            default:
                System.out.println("Invalid command! Try again!");
        }
    }

    private static void addFavorite(){
        System.out.print("BookId: ");
        String bookId = scan.nextLine();

        BookManagement.applyFavorite(bookId);
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    private static void showFavorite(){
        System.out.print("BookId: ");
        String bookId = scan.nextLine();

        BookManagement.displayFavorite();
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    private static void updateHorrorList(){
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String horrorGenre = scan.nextLine();

        BookManagement.updateHorrorList(bookId, horrorGenre);
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    private static void updateHistoryList(){
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String historyGenre = scan.nextLine();

        BookManagement.updateHistoryList(bookId, historyGenre);
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    private static void updateApocalypseList(){
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String apocalypseGenre = scan.nextLine();

        BookManagement.updateFantasyList(bookId, apocalypseGenre);
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    private static void updateFantasyList(){
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String fantasyGenre = scan.nextLine();

        BookManagement.updateFantasyList(bookId, fantasyGenre);
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    private static void updateRomanceList(){
        System.out.print("Book Id: ");
        String bookId = scan.nextLine();

        System.out.print("New subgenre: ");
        String romanceGenre = scan.nextLine();

        BookManagement.updateRomanceList(bookId,romanceGenre);
        System.out.println("Press Enter to return to the menu");
        scan.nextLine();
        Main.menu();
    }

    public static void main(String[] args) {

        while (repeat){
            menu();
        }
    }

}
