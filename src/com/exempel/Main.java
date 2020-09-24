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
                BookManagement.updateAuthor();
                break;
            case 5:
                BookManagement.updateTitle();
                break;
            case 6:
                BookManagement.updatePrice();
            case 7:
                BookManagement.displayAuthor();
                break;
            case 8:
                BookManagement.displayTitle();
                break;
            case 9:
                BookManagement.displayPrice();
                break;
            case 10:
                BookManagement.ApocalypseBook();
                break;
            case 11:
                BookManagement.FantasyBook();
            case 12:
                BookManagement.HistoryBook();
                break;
            case 13:
                BookManagement.HorrorBook();
                break;
            case 14:
                BookManagement.RomanceBook();
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
                updateApocalypseList();
                break;
            case 21:
                updateFantasyList();
                break;
            case 22:
                updateHistoryList();
                break;
            case 23:
                updateHorrorList();
                break;
            case 24:
                updateRomanceList();
                break;
            case 25:
                addFavorite();
                break;
            case 26:
                showFavorite();
                break;
            case 27:
                deleteFavorite();
                break;
            default:
                System.out.println("Invalid command! Try again!");
        }
    }

    private static void addFavorite(){
        System.out.println("Please insert new favorite");
        System.out.print("BookId: ");
        String bookId = scan.nextLine();

        BookManagement.applyFavorite(bookId);
    }

    private static void showFavorite(){
       
       BookManagement.displayFavorite();
    }

    private static void deleteFavorite() {

        System.out.println("Which favorite do you want to remove");
        System.out.print("BookId: ");
        String bookId = scan.nextLine();

        BookManagement.removeFavorite(bookId);
    }

    private static void updateHorrorList(){
        System.out.println("Please add the new data");
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
        System.out.println("Please add the new data");
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
        System.out.println("Please add the new data");
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
        System.out.println("Please add the new data");
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
        System.out.println("Please add the new data");
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
