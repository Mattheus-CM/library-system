package controller;

import dao.BookDAO;
import view.BookView;
import view.MenuView;

public class LibraryController {
    private MenuView menuView;
    private BookController bookController;

    public LibraryController() {
        this.menuView = new MenuView();
        BookView bookView = new BookView();
        BookDAO bookDAO = new BookDAO();
        this.bookController = new BookController(bookDAO, bookView, this.menuView);
    }

    public void start() {
        int option;

        do {
            option = menuView.mainMenu();

            switch (option) {
                case 1:
                    manageBooks();
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
}
