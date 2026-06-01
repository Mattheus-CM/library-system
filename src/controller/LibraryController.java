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
                    bookController.manage();
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
}
