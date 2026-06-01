import controller.LibraryController;
import domain.Book;
import domain.Loan;
import domain.User;
import view.MenuView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryController libraryController = new LibraryController();
        libraryController.start();
    }
}