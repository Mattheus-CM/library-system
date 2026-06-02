package view;

import java.util.Scanner;

public class MenuView {
    private Scanner input;

    public MenuView() {
        this.input = new Scanner(System.in);
    }

    public int mainMenu() {
        System.out.println("--- Welcome to Book Management System ---");
        System.out.println("1. Manage Book");
        System.out.println("0. Exit");
        System.out.print("Type an option: ");

        int option = input.nextInt();
        input.nextLine();
        return option;
    }

    public int manageBookMenu() {
        System.out.println();
        System.out.println("--- Manage Book ---");
        System.out.println("1. Create Book");
        System.out.println("2. List all Books");
        System.out.println("0. Exit");
        System.out.print("Type an option: ");

        int option = input.nextInt();
        input.nextLine();
        return option;
    }

    public void manageUserMenu() {
        System.out.println("--- Manage User ---");
        System.out.println("1. Create User");
        System.out.println("2. List all Users");
        System.out.println("3. Update Users");
        System.out.println("4. Delete User");
        System.out.println("0. Exit");
        System.out.print("Type a number: ");
    }

    public String readString(String message) {
        System.out.print(message);
        return input.nextLine();
    }

    public int readInt(String message) {
        System.out.print(message);
        int value = input.nextInt();
        input.nextLine();
        return value;
    }

}