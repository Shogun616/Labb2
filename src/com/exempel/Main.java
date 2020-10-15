package com.exempel;

import java.util.Scanner;

public class Main{

    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);

   public static void options(){

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
        System.out.println("10. Add Favorite");
        System.out.println("11. Show Favorite");
        System.out.println("12. Remove Favorite");
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
                break;
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
                BookManagement.addFavoriteBook();
                break;
            case 11:
                BookManagement.showFavorite();
                break;
            case 12:
                BookManagement.deleteFavoriteBook();
                break;
            default:
                System.out.println("Invalid command! Try again!");
        }
    }

    public static void main(String[] args) {
        while (repeat){
            menu();
        }
    }
}
