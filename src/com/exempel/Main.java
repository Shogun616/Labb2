package com.exempel;

import java.util.Scanner;

public class Main{

    static boolean repeat = true;
    static String decision;
    static Scanner scan = new Scanner(System.in);

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
        System.out.println("3. Delete Book");
        System.out.println("4. Update title");
        System.out.println("5. Update Price");
        System.out.println("6. Update Author");
        System.out.println("7. Update Genre");
        System.out.println("8. Update Year");
        System.out.println("9. Show Title");
        System.out.println("10. Show Author");
        System.out.println("11. Show Genre");
        System.out.println("12. Show Year");
        System.out.println("13. Show Price");
        System.out.println("14. Show Horror List");
        System.out.println("15. Show History List");
        System.out.println("16. Show Apocalypse List");
        System.out.println("17. Show Fantasy List");
        System.out.println("18. Show Romance List");
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
                BookManagement.updateAuthor();
                break;
            case 7:
                BookManagement.updateGenre();
                break;
            case 8:
                BookManagement.updateYear();
                break;
            case 9:
                BookManagement.showTitle();
                break;
            case 10:
                BookManagement.showAuthor();
                break;
            case 11:
                BookManagement.showGenre();
                break;
            case 12:
                BookManagement.showYear();
                break;
            case 13:
                BookManagement.showPrice();
                break;
            case 14:
                BookManagement.showHorrorList();
                break;
            case 15:
                BookManagement.showHistoryList();
                break;
            case 16:
                BookManagement.showApocalypseList();
                break;
            case 17:
                BookManagement.showFantasyList();
                break;
            case 18:
                BookManagement.showRomanceList();
                break;

            default:
                System.out.println("Invalid command! Try again!");
        }
    }

    public static void main(String[] args) {

        BookManagement.fillMockDB();

        while (repeat){
            menu();
        }
    }
}
