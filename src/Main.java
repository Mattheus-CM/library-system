import domain.Book;
import domain.Loan;
import domain.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menu
        while (true) {
            System.out.println("--- Welcome to Book Management System ---");
            System.out.println("1. Manage Book");
            System.out.println("2. Manage User");
            System.out.println("3. Manage Loan");
            System.out.println("0. Exit");
            System.out.print("Type a number: ");
            int option = input.nextInt();
            if (option == 0) break;
            switch (option) {
                case 1:
                    System.out.println("--- Manage Book ---");
                    System.out.println("1. Create Book");
                    System.out.println("2. List all Books");
                    System.out.println("3. Update Book");
                    System.out.println("4. Delete Book");
                    System.out.println("0. Exit");
                    System.out.print("Type a number: ");
                    option = input.nextInt();
                    if (option == 0) break;

                    switch (option) {
                        case 1:
                            System.out.println("Creating book...");
                            break;

                        case 2:
                            System.out.println("Listing book...");
                            break;

                        case 3:
                            System.out.println("Updating book...");
                            break;

                        case 4:
                            System.out.println("Deleting book...");
                            break;

                        default:
                            System.out.println("Invalid option");
                            break;
                    }

                case 2:
                    System.out.println("--- Manage User ---");
                    System.out.println("1. Create User");
                    System.out.println("2. List all Users");
                    System.out.println("3. Update Users");
                    System.out.println("4. Delete User");
                    System.out.println("0. Exit");
                    System.out.print("Type a number: ");
                    option = input.nextInt();
                    if (option == 0) break;

                    switch (option) {
                        case 1:
                            System.out.println("Creating user...");
                            break;

                        case 2:
                            System.out.println("Listing user...");
                            break;

                        case 3:
                            System.out.println("Updating user...");
                            break;

                        case 4:
                            System.out.println("Deleting user...");
                            break;

                        default:
                            System.out.println("Invalid option");
                            break;
                    }

                case 3:
                    System.out.println("--- Manage Loan ---");
                    System.out.println("1. Create Loan");
                    System.out.println("2. List all Loans");
                    System.out.println("3. Update Loans");
                    System.out.println("4. Delete Loan");
                    System.out.println("0. Exit");
                    System.out.print("Type a number: ");
                    option = input.nextInt();
                    if (option == 0) break;

                    switch (option) {
                        case 1:
                            System.out.println("Creating loan...");
                            break;

                        case 2:
                            System.out.println("Listing loans...");
                            break;

                        case 3:
                            System.out.println("Updating loan...");
                            break;

                        case 4:
                            System.out.println("Deleting loan...");
                            break;

                        default:
                            System.out.println("Invalid option");
                            break;
                    }


                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }

        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch",
                "3rd", "Addison-Wesley", 5);
        Book book2 = new Book("978-0439708184", "Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling", "1st", "Scholastic", 8);
        Book book3 = new Book("978-1491950357", "Designing Data-Intensive Applications",
                "Martin Kleppmann", "2nd", "O'Reilly Media", 3);

        User user1 = new User(1, "Mattheus Martins", "mattheus_cmartins@hotmail.com");

        Loan loan1 = new Loan(1, "26/05/2026", "02/06/2026", book1, user1);

        loan1.print();
    }
}