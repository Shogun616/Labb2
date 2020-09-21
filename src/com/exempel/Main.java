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
        System.out.println("4. update Author");
        System.out.println("5. Update title");
        System.out.println("6. Update Price");
        System.out.println();
        System.out.println("7. Show Author");
        System.out.println("8. Show Title");
        System.out.println("9. Show Price");
        System.out.println();
        System.out.println("10. Show Horror List");
        System.out.println("11. Show History List");
        System.out.println("12. Show Apocalypse List");
        System.out.println("13. Show Fantasy List");
        System.out.println("14. Show Romance List");
        System.out.println();
        System.out.println("15. Update Apocalypse List");
        System.out.println("16. Update History List");
        System.out.println("17. Update Horror List");
        System.out.println("18. Update Fantasy List");
        System.out.println("19. Update Romance List");
        System.out.println();
        System.out.println("20. Add Apocalypse List");
        System.out.println("21. Add History List");
        System.out.println("22. Add Horror List");
        System.out.println("23. Add Fantasy List");
        System.out.println("24. Add Romance List");
        System.out.println();
        System.out.println("25. Add Favorite");
        System.out.println("26. Show Favorite");
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
                BookManagement.updateAuthor();
                break;
            case 5:
                BookManagement.updateTitle();
                break;
            case 6:
                BookManagement.displayPrice();
            case 7:
                BookManagement.displayAuthor();
                break;
            case 8:
                BookManagement.displayTitle();
                break;
            case 9:
                BookManagement.updatePrice();
                break;
            case 10:
                BookManagement.showHorrorList();
                break;
            case 11:
                BookManagement.showHistoryList();
            case 12:
                BookManagement.showApocalypseList();
                break;
            case 13:
                BookManagement.showFantasyList();
                break;
            case 14:
                BookManagement.showRomanceList();
            case 15:
                updateApocalypseList();
                break;
            case 16:
                updateHistoryList();
                break;
            case 17:
                updateHorrorList();
                break;
            case 18:
                updateFantasyList();
                break;
            case 19:
                updateRomanceList();
                break;
            case 20:
                BookManagement.ApocalypseBook();
                break;
            case 21:
                BookManagement.HistoryBook();
                break;
            case 22:
                BookManagement.HorrorBook();
                break;
            case 23:
                BookManagement.FantasyBook();
                break;
            case 24:
                BookManagement.RomanceBook();
                break;
            case 25:
                addFavorite();
                break;
            case 26:
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

        BookManagement.updateApocalypseList(bookId, apocalypseGenre);
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
