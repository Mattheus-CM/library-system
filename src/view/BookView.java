package view;

import domain.Book;

public class BookView {
    public void showBooksList(Book[] books) {
        if (books.length == 0) {
            System.out.println("No books found");
            return;
        }
        System.out.println("--------------------------");
        System.out.println("------- BOOKS LIST -------");
        System.out.println("--------------------------");
        for (Book book : books) {
            if (book == null) continue;
            System.out.println(book);
        }
        System.out.println("--------------------------");
    }
}
