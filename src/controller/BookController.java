package controller;

import dao.BookDAO;
import domain.Book;
import view.BookView;
import view.MenuView;

public class BookController {
    private BookDAO bookDAO;
    private BookView bookView;
    private MenuView menuView;

    public BookController(BookDAO bookDAO, BookView bookView, MenuView menuView) {
        this.bookDAO = bookDAO;
        this.bookView = bookView;
        this.menuView = menuView;
    }

    public void create() {
        System.out.println("--------------------------");
        System.out.println("------ CREATE BOOK -------");
        System.out.println("--------------------------");

        String title = menuView.readString("Title: ");
        String author = menuView.readString("Author: ");
        String edition = menuView.readString("Edition: ");
        String publisher = menuView.readString("Publisher: ");
        String isbn = menuView.readString("ISBN: ");

        Book book = new Book(title, author, edition, publisher, isbn);
        if (!bookDAO.save(book)) {
            System.out.println("Book could not be saved");
        } else {
            System.out.println("Book has been created");
        }
    }

    public void list() {
        Book[] books = bookDAO.getBooks();
        bookView.showBooksList(books);
    }
}
