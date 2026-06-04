package controller;

import dao.BookDAO;
import dao.UserDAO;
import domain.User;
import view.BookView;
import view.MenuView;
import view.UserView;

public class LibraryController {
    private MenuView menuView;
    private BookController bookController;
    private UserController userController;

    public LibraryController() {
        this.menuView = new MenuView();
        BookView bookView = new BookView();
        UserView userView = new UserView();
        BookDAO bookDAO = new BookDAO();
        UserDAO userDAO = new UserDAO();
        this.bookController = new BookController(bookDAO, bookView, this.menuView);
        this.userController = new UserController(userDAO, userView, this.menuView);
    }

    public void start() {
        int option;

        do {
            option = menuView.mainMenu();

            switch (option) {
                case 1:
                    manageBooks();
                    break;

                case 2:
                    manageUsers();
                    break;

                case 0:
                    System.out.println("Good Bye!");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        } while (option != 0);
    }

    public void manageBooks() {
        int option;
        do {
            option = menuView.manageBookMenu();

            switch (option) {
                case 1:
                    bookController.create();
                    break;

                case 2:
                    bookController.list();
                    break;

                case 0:
                    System.out.println("Returning to main menu...");
                    break;
            }
        } while (option != 0);
    }

    public void manageUsers() {
        int option;
        do {
            option = menuView.manageUserMenu();

            switch (option) {
                case 1:
                    userController.create();
                    break;

                case 2:
                    userController.list();
                    break;

                case 0:
                    System.out.println("Returning to main menu...");
                    break;
            }
        } while (option != 0);
    }
}
